package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorBoldIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 116h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM104 92h-4v-4C100 81.373 94.627 76 88 76 81.373 76 76 81.373 76 88v4h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM244.76 202.94c-6.781 9.669-17.489 15.848-29.254 16.88-11.765 1.032-23.385-3.188-31.746-11.53-.187-.177-.364-.364-.53-.56L144.67 164h-33.34L72.81 207.73c-.17 .19-.35 .38-.53 .56-12.348 12.332-31.266 15.236-46.744 7.174C10.058 207.403 1.593 190.237 4.62 173.05c-.006-.067-.006-.133 0-.2L21 88.79C26.38 58.27 52.89 36.015 83.88 36h88.12c30.882 .044 57.34 22.108 62.93 52.48 .003 .063 .003 .127 0 .19l16.36 84.17c.004 .067 .004 .133 0 .2 1.902 10.439-.449 21.205-6.53 29.9ZM172 140c22.091 0 40-17.909 40-40C212 77.909 194.091 60 172 60h-88.11C64.508 60.019 47.943 73.965 44.62 93.06c-.005 .07-.005 .14 0 .21L28.28 177.27c-1.475 8.676 4.333 16.914 13 18.44 5.026 .877 10.17-.686 13.86-4.21L96.9 144.07c2.277-2.586 5.555-4.068 9-4.07ZM227.76 177.31l-7-35.95c-11.122 13.152-27.088 21.252-44.27 22.46l24.41 27.72c4.982 4.78 12.469 5.825 18.569 2.591 6.101-3.233 9.439-10.015 8.281-16.821Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
