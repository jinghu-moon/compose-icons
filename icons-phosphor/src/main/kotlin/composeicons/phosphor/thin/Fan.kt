package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorThinIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.12 136C224.411 118.39 211.426 104.174 194.313 97.894c-17.113-6.28-36.211-3.838-51.193 6.546-1.444-.934-2.97-1.734-4.56-2.39L155.83 33.11c.418-1.666-.274-3.413-1.72-4.34C136.537 17.687 114.272 17.244 96.272 27.619 78.271 37.994 67.495 57.482 68.276 78.244c.782 20.762 12.994 39.384 31.724 48.376 0 .46 0 .92 0 1.38 0 1.258 .087 2.514 .26 3.76L31.91 151.28c-1.656 .467-2.828 1.941-2.91 3.66-1.187 26.263 16.056 49.816 41.45 56.62 4.758 1.277 9.663 1.926 14.59 1.93 15.629-.044 30.53-6.609 41.11-18.112 10.58-11.503 15.879-26.9 14.62-42.478 1.525-.788 2.975-1.716 4.33-2.77l51.09 49.44c.752 .73 1.761 1.136 2.81 1.13 .64-.003 1.271-.157 1.84-.45C224.186 188.133 235.952 161.4 229.12 136ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM76 76C75.996 58.973 85.014 43.218 99.697 34.597c14.684-8.621 32.836-8.818 47.702-.517l-16.55 66.06c-.94-.09-1.89-.14-2.85-.14-11.793 .016-22.318 7.404-26.34 18.49C85.85 110.222 75.957 93.841 76 76ZM109 199c-14.743 8.515-32.894 8.582-47.7 .177C46.493 190.773 37.247 175.154 37 158.13l65.5-18.7c4.499 10.06 14.48 16.546 25.5 16.57 1.656-.004 3.309-.152 4.94-.44 .742 17.811-8.486 34.555-23.94 43.44ZM216.6 174.54c-4.101 7.1-9.954 13.028-17 17.22l-49-47.37c7.553-10.409 7.016-24.631-1.3-34.44 18.67-11.815 42.993-9.359 58.925 5.949 15.932 15.308 19.356 39.514 8.295 58.641Z"),
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
        return _fan!!
    }

private var _fan: ImageVector? = null
