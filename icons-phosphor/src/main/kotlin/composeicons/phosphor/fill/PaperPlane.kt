package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorFillIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.2 218.31c-3.022 3.612-7.491 5.696-12.2 5.69-1.829-.002-3.645-.313-5.37-.92l-79.95-27c-1.626-.549-2.72-2.074-2.72-3.79v-72.29c.005-2.217-.91-4.336-2.527-5.853-1.617-1.517-3.791-2.294-6.003-2.147-4.267 .376-7.523 3.977-7.47 8.26v72c0 1.716-1.094 3.241-2.72 3.79l-79.95 27c-6.28 2.207-13.271 .294-17.553-4.802-4.282-5.096-4.962-12.312-1.707-18.118L114 32.13c2.834-5.038 8.165-8.155 13.945-8.155 5.78 0 11.111 3.118 13.945 8.155l96.01 167.97c3.333 5.82 2.653 13.107-1.7 18.21Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
