package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorThinIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.62 129.7C214.4 174.93 196.1 196 178 196c-22.56 0-37.67-32.21-53.66-66.3C110.15 99.37 95.44 68 78 68 63.8 68 46.87 88.76 27.66 129.7c-.963 1.956-3.315 2.78-5.288 1.853-1.973-.927-2.841-3.263-1.952-5.253C41.6 81.07 59.9 60 78 60c22.56 0 37.67 32.21 53.66 66.3C145.85 156.63 160.56 188 178 188c14.2 0 31.13-20.76 50.34-61.7 .963-1.956 3.315-2.78 5.288-1.853 1.973 .927 2.841 3.263 1.952 5.253Z"),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
