package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorLightIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 18.000 L 112.000 18.000 C 77.774 18.039 50.039 45.774 50.000 80.000 L 50.000 176.000 C 50.039 210.226 77.774 237.961 112.000 238.000 L 144.000 238.000 C 178.226 237.961 205.961 210.226 206.000 176.000 L 206.000 80.000 C 205.961 45.774 178.226 18.039 144.000 18.000 ZM 194.000 176.000 C 193.967 203.601 171.601 225.967 144.000 226.000 L 112.000 226.000 C 84.399 225.967 62.033 203.601 62.000 176.000 L 62.000 80.000 C 62.033 52.399 84.399 30.033 112.000 30.000 L 144.000 30.000 C 171.601 30.033 193.967 52.399 194.000 80.000 ZM 134.000 78.490 L 134.000 177.490 L 147.760 163.740 C 150.124 161.537 153.808 161.602 156.093 163.887 C 158.378 166.172 158.443 169.856 156.240 172.220 L 132.240 196.220 C 129.897 198.560 126.103 198.560 123.760 196.220 L 99.760 172.220 C 97.557 169.856 97.622 166.172 99.907 163.887 C 102.192 161.602 105.876 161.537 108.240 163.740 L 122.000 177.510 L 122.000 78.510 L 108.240 92.240 C 105.876 94.443 102.192 94.378 99.907 92.093 C 97.622 89.808 97.557 86.124 99.760 83.760 L 123.760 59.760 C 126.103 57.420 129.897 57.420 132.240 59.760 L 156.240 83.760 C 157.845 85.256 158.506 87.508 157.963 89.634 C 157.420 91.760 155.760 93.420 153.634 93.963 C 151.508 94.506 149.256 93.845 147.760 92.240 Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
