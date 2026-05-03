package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorLightIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.120 55.870 C 174.423 29.753 136.693 19.425 101.277 28.813 C 65.861 38.201 38.202 65.863 28.816 101.279 C 19.430 136.696 29.761 174.425 55.880 200.120 C 81.577 226.237 119.307 236.565 154.723 227.177 C 190.139 217.789 217.798 190.127 227.184 154.711 C 236.570 119.294 226.239 81.565 200.120 55.870 ZM 94.000 211.370 L 94.000 152.000 C 94.000 150.895 94.895 150.000 96.000 150.000 L 160.000 150.000 C 161.105 150.000 162.000 150.895 162.000 152.000 L 162.000 211.370 C 140.195 220.210 115.805 220.210 94.000 211.370 ZM 146.000 138.000 L 110.000 138.000 L 110.000 99.710 L 146.000 81.710 ZM 191.640 191.640 L 191.640 191.640 C 186.348 196.932 180.423 201.550 174.000 205.390 L 174.000 152.000 C 174.000 144.268 167.732 138.000 160.000 138.000 L 158.000 138.000 L 158.000 72.000 C 158.001 69.921 156.925 67.990 155.157 66.896 C 153.389 65.802 151.180 65.701 149.320 66.630 L 101.320 90.630 C 99.285 91.646 97.999 93.725 98.000 96.000 L 98.000 138.000 L 96.000 138.000 C 88.268 138.000 82.000 144.268 82.000 152.000 L 82.000 205.390 C 75.577 201.550 69.652 196.932 64.360 191.640 C 29.213 156.493 29.213 99.508 64.361 64.361 C 99.508 29.214 156.492 29.214 191.639 64.361 C 226.787 99.508 226.787 156.493 191.640 191.640 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
