package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorFillIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L191.8 210.07c4.216-3.278 8.171-6.879 11.83-10.77ZM64.2 45.93 53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L52.37 56.7c3.659-3.891 7.614-7.492 11.83-10.77ZM203.63 199.3 64.2 45.93C107.07 12.552 168.414 17.824 204.962 58.025c36.548 40.202 35.967 101.769-1.332 141.275ZM159 104C156.362 93.774 148.848 85.509 138.92 81.91c-4.037-1.149-8.275 1.018-9.709 4.963-1.433 3.945 .426 8.327 4.259 10.037 4.938 1.802 8.676 5.913 10 11 .911 3.53 4.094 5.997 7.74 6 .675 .002 1.348-.086 2-.26 4.249-1.086 6.831-5.39 5.79-9.65ZM192 112C192.007 91.115 181.823 71.541 164.717 59.56 147.611 47.578 125.735 44.697 106.11 51.84c-3.859 1.699-5.738 6.101-4.293 10.063 1.445 3.961 5.716 6.122 9.763 4.937 14.726-5.361 31.141-3.196 43.973 5.8C168.385 81.636 176.018 96.329 176 112c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM148 168c-11.046 0-20-8.954-20-20-.013-2.37 .324-4.729 1-7L108.55 118.5c-1.325 .958-2.915 1.482-4.55 1.5-4.418 0-8-3.582-8-8 0-2.204 .228-4.403 .68-6.56L84.39 91.92C81.481 98.214 79.983 105.067 80 112c0 11.9 6.71 20.5 13.82 29.6 7 8.92 14.18 18.15 14.18 30.4-.003 8.054 4.826 15.324 12.251 18.445 7.425 3.121 15.997 1.483 21.749-4.155 2.014-2.129 5.031-2.986 7.863-2.235 2.832 .751 5.027 2.992 5.721 5.839 .694 2.847-.225 5.846-2.394 7.816-10.353 10.14-25.775 13.084-39.135 7.47C100.695 199.567 92.004 186.491 92 172c0-6.74-5-13.14-10.79-20.55C73.54 141.63 64 129.41 64 112c-.013-11.501 3.098-22.789 9-32.66L52.37 56.7C15.07 96.206 14.49 157.773 51.038 197.975c36.548 40.202 97.892 45.473 140.762 12.095L153 167.37c-1.633 .422-3.313 .634-5 .63Z"),
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
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
