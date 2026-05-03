package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) return _personSimpleBike!!
        _personSimpleBike = phosphorLightIcon(
            name = "PersonSimpleBike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 78.000 C 178.359 78.000 190.000 66.359 190.000 52.000 C 190.000 37.641 178.359 26.000 164.000 26.000 C 149.641 26.000 138.000 37.641 138.000 52.000 C 138.000 66.359 149.641 78.000 164.000 78.000 ZM 164.000 38.000 C 171.732 38.000 178.000 44.268 178.000 52.000 C 178.000 59.732 171.732 66.000 164.000 66.000 C 156.268 66.000 150.000 59.732 150.000 52.000 C 150.000 44.268 156.268 38.000 164.000 38.000 ZM 200.000 138.000 C 179.013 138.000 162.000 155.013 162.000 176.000 C 162.000 196.987 179.013 214.000 200.000 214.000 C 220.987 214.000 238.000 196.987 238.000 176.000 C 238.000 155.013 220.987 138.000 200.000 138.000 ZM 200.000 202.000 C 185.641 202.000 174.000 190.359 174.000 176.000 C 174.000 161.641 185.641 150.000 200.000 150.000 C 214.359 150.000 226.000 161.641 226.000 176.000 C 226.000 190.359 214.359 202.000 200.000 202.000 ZM 56.000 138.000 C 35.013 138.000 18.000 155.013 18.000 176.000 C 18.000 196.987 35.013 214.000 56.000 214.000 C 76.987 214.000 94.000 196.987 94.000 176.000 C 94.000 155.013 76.987 138.000 56.000 138.000 ZM 56.000 202.000 C 41.641 202.000 30.000 190.359 30.000 176.000 C 30.000 161.641 41.641 150.000 56.000 150.000 C 70.359 150.000 82.000 161.641 82.000 176.000 C 82.000 190.359 70.359 202.000 56.000 202.000 ZM 192.000 118.000 L 152.000 118.000 C 150.409 117.999 148.884 117.366 147.760 116.240 L 120.000 88.490 L 96.490 112.000 L 132.240 147.760 C 133.366 148.884 133.999 150.409 134.000 152.000 L 134.000 200.000 C 134.000 203.314 131.314 206.000 128.000 206.000 C 124.686 206.000 122.000 203.314 122.000 200.000 L 122.000 154.490 L 83.760 116.240 C 81.420 113.897 81.420 110.103 83.760 107.760 L 115.760 75.760 C 118.103 73.420 121.897 73.420 124.240 75.760 L 154.490 106.000 L 192.000 106.000 C 195.314 106.000 198.000 108.686 198.000 112.000 C 198.000 115.314 195.314 118.000 192.000 118.000 Z"),
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
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
