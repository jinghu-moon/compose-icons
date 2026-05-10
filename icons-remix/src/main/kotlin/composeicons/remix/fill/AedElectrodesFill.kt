package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AedElectrodesFill: ImageVector
    get() {
        if (_aedElectrodesFill != null) return _aedElectrodesFill!!
        _aedElectrodesFill = remixIcon(
            name = "AedElectrodesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 3C7.448 3 7 3.448 7 4v3h-3C3.448 7 3 7.448 3 8v12c0 .552 .448 1 1 1h5v2h2v-2h5c.552 0 1-.448 1-1v-3h3c.552 0 1-.448 1-1v-12C21 3.448 20.552 3 20 3h-12ZM17 15v-7C17 7.448 16.552 7 16 7h-7v-2h10v10h-2Z"),
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
        return _aedElectrodesFill!!
    }

private var _aedElectrodesFill: ImageVector? = null
