package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) return _redditLogo!!
        _redditLogo = phosphorBoldIcon(
            name = "RedditLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 104C251.993 90.413 244.336 77.987 232.203 71.871c-12.134-6.115-26.676-4.878-37.603 3.199C178.152 66.989 160.327 62.086 142.06 60.62l3.8-22.81 15.67 2.61c3.808 10.173 13.975 16.521 24.787 15.475 10.812-1.046 19.574-9.223 21.362-19.938C209.468 25.242 203.836 14.662 193.949 10.162 184.062 5.662 172.385 8.364 165.48 16.75L138 12.16c-3.14-.533-6.364 .205-8.96 2.051-2.596 1.846-4.352 4.648-4.88 7.789l-6.38 38.31C97.48 61.62 78 66.7 61.4 75.07 46.399 64.086 25.501 66.332 13.177 80.254 .853 94.175 1.157 115.192 13.88 128.75 12.632 133.737 12.001 138.859 12 144c0 23.29 12.65 44.87 35.63 60.78C69.26 219.75 97.8 228 128 228c30.2 0 58.74-8.25 80.37-23.22C231.35 188.87 244 167.29 244 144c-.001-5.141-.632-10.263-1.88-15.25 6.324-6.691 9.858-15.543 9.88-24.75ZM222.09 114.34c-5.191 3.04-7.329 9.454-5 15 1.892 4.658 2.879 9.633 2.91 14.66 0 15.18-9 29.75-25.29 41.05C177.05 197.27 153.36 204 128 204c-25.36 0-49-6.73-66.71-18.95C45 173.75 36 159.18 36 144c.014-5.015 .978-9.983 2.84-14.64 2.341-5.529 .235-11.938-4.93-15-4.225-2.467-6.529-7.253-5.823-12.095 .706-4.842 4.281-8.77 9.035-9.927 4.754-1.158 9.735 .687 12.588 4.662 3.677 5.045 10.608 6.428 15.94 3.18l.22-.13C82.94 89.68 105 84 128 84h0c23 0 45 5.69 62.09 16l.22 .13c5.328 3.283 12.284 1.921 15.98-3.13 2.233-3.144 5.854-5.008 9.71-5 5.412-0 10.154 3.622 11.578 8.844 1.423 5.221-.824 10.75-5.488 13.496ZM88 148C76.954 148 68 139.046 68 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM188 128c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM167.48 168.52c.934 3.05 .615 6.346-.886 9.161-1.501 2.815-4.061 4.916-7.114 5.839-20.566 6.035-42.434 6.035-63 0-6.351-1.933-9.933-8.649-8-15 1.933-6.351 8.649-9.933 15-8 16.005 4.632 32.995 4.632 49 0 3.05-.934 6.346-.615 9.161 .886 2.815 1.501 4.916 4.061 5.839 7.114Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
