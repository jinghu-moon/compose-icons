package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorBoldIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 128.000 84.000 C 103.711 84.028 84.028 103.711 84.000 128.000 C 84.000 134.627 78.627 140.000 72.000 140.000 C 65.373 140.000 60.000 134.627 60.000 128.000 C 60.039 90.461 90.461 60.039 128.000 60.000 C 134.627 60.000 140.000 65.373 140.000 72.000 C 140.000 78.627 134.627 84.000 128.000 84.000 ZM 196.000 128.000 C 195.961 165.539 165.539 195.961 128.000 196.000 C 121.373 196.000 116.000 190.627 116.000 184.000 C 116.000 177.373 121.373 172.000 128.000 172.000 C 152.289 171.972 171.972 152.289 172.000 128.000 C 172.000 121.373 177.373 116.000 184.000 116.000 C 190.627 116.000 196.000 121.373 196.000 128.000 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
