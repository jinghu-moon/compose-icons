package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorFillIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 160.000 C 239.975 201.316 208.493 235.816 167.352 239.613 C 126.210 243.410 88.946 215.254 81.360 174.640 C 107.281 179.461 133.914 171.201 152.557 152.557 C 171.201 133.914 179.461 107.281 174.640 81.360 C 212.523 88.412 239.996 121.467 240.000 160.000 ZM 160.000 80.000 C 164.911 80.005 169.812 80.460 174.640 81.360 C 167.253 41.642 131.412 13.664 91.088 16.139 C 50.765 18.614 18.614 50.765 16.139 91.088 C 13.664 131.412 41.642 167.253 81.360 174.640 C 77.008 151.263 83.282 127.161 98.479 108.872 C 113.676 90.583 136.221 80.003 160.000 80.000 Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
