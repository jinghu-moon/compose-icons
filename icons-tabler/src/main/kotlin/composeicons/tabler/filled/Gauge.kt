package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = tablerFilledIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM16.707 7.293c-.391-.39-1.024-.39-1.414 0L12.703 9.883l-.083 .094-.068 .1c-.579-.166-1.201-.063-1.695 .281-.494 .344-.807 .892-.852 1.493L10 12l.005 .15c.057 .761 .543 1.423 1.252 1.707 .709 .283 1.517 .139 2.083-.373 .566-.512 .792-1.301 .582-2.035 .071-.042 .137-.093 .195-.152L16.707 8.707l.083-.094c.309-.398 .273-.964-.083-1.32ZM12 6C8.686 6 6 8.686 6 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 9.791 9.791 8 12 8c.552 0 1-.448 1-1C13 6.448 12.552 6 12 6Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
