package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GearSix: ImageVector
    get() {
        if (_gearSix != null) return _gearSix!!
        _gearSix = phosphorBoldIcon(
            name = "GearSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 76C99.281 76 76 99.281 76 128c0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52C179.967 99.295 156.705 76.033 128 76ZM128 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM241.86 106.43c-.685-3.42-2.824-6.373-5.86-8.09L208.21 82.49l-.11-31.31c-.012-3.516-1.566-6.849-4.25-9.12-11.199-9.475-24.094-16.74-38-21.41-3.208-1.082-6.723-.759-9.68 .89L128 37.27 99.83 21.53c-2.961-1.658-6.485-1.985-9.7-.9C76.22 25.319 63.325 32.605 52.13 42.1c-2.675 2.268-4.224 5.593-4.24 9.1l-.14 31.34L20 98.35c-3.037 1.723-5.173 4.684-5.85 8.11-2.825 14.231-2.825 28.879 0 43.11 .682 3.418 2.818 6.371 5.85 8.09l27.82 15.85 .11 31.31c.012 3.516 1.566 6.849 4.25 9.12 11.199 9.475 24.094 16.74 38 21.41 3.208 1.082 6.723 .759 9.68-.89L128 218.73l28.14 15.74c2.961 1.658 6.485 1.985 9.7 .9 13.91-4.689 26.805-11.975 38-21.47 2.675-2.268 4.224-5.593 4.24-9.1l.14-31.34 27.81-15.81c3.037-1.723 5.173-4.684 5.85-8.11 2.818-14.232 2.812-28.88-.02-43.11ZM219.23 139.61l-26.88 15.28c-1.91 1.083-3.484 2.671-4.55 4.59-.54 1-1.11 1.93-1.7 2.88-1.185 1.892-1.819 4.077-1.83 6.31L184.13 199c-6.469 4.868-13.554 8.859-21.07 11.87L135.91 195.68c-1.79-1.003-3.808-1.529-5.86-1.53h-.29c-1.14 0-2.3 0-3.44 0-2.144-.051-4.264 .47-6.14 1.51L93 210.82C85.472 207.824 78.37 203.85 71.88 199l-.11-30.24c-.009-2.236-.643-4.425-1.83-6.32-.58-.94-1.16-1.91-1.7-2.88C67.173 157.653 65.603 156.075 63.7 155L36.8 139.63c-1.045-7.711-1.045-15.529 0-23.24L63.68 101.11c1.907-1.082 3.48-2.666 4.55-4.58 .54-1 1.11-1.94 1.7-2.89 1.185-1.892 1.819-4.077 1.83-6.31L71.87 57C78.342 52.146 85.426 48.168 92.94 45.17l27.15 15.19c1.875 1.052 4 1.577 6.15 1.52 1.14 0 2.3 0 3.44 0 2.144 .051 4.264-.47 6.14-1.51L163 45.18c7.528 2.996 14.63 6.97 21.12 11.82l.11 30.24c.009 2.236 .643 4.425 1.83 6.32 .58 .94 1.16 1.91 1.7 2.88 1.067 1.907 2.637 3.485 4.54 4.56l26.9 15.33c1.059 7.723 1.069 15.554 .03 23.28Z"),
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
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
