package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorBoldIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M145.93 14.77c-3.002-2.489-7.027-3.364-10.792-2.346-3.765 1.018-6.8 3.802-8.138 7.466L107.07 74.5 87.38 55.39C84.919 53 81.552 51.778 78.131 52.032c-3.421 .254-6.57 1.961-8.651 4.688C47.27 85.82 36 115.19 36 144c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 82.85 168.2 33.25 145.93 14.77ZM128 212C90.461 211.961 60.039 181.539 60 144c0-19.94 7-40.62 20.71-61.64l22.93 22.25c2.919 2.832 7.074 3.993 11.038 3.085 3.964-.909 7.198-3.764 8.592-7.585L143.48 44.71C165.39 65.61 196 102.29 196 144c-.039 37.539-30.461 67.961-68 68Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
