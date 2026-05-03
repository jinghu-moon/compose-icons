package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorThinIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(133.17f, 158.84f),
                    PathNode.CurveTo(161.11523f, 146.88643f, 176.7984f, 116.92664f, 170.69743f, 87.15078f),
                    PathNode.CurveTo(164.59648f, 57.37491f, 138.39447f, 35.997234f, 108.0f, 35.997234f),
                    PathNode.CurveTo(77.60553f, 35.997234f, 51.403522f, 57.37491f, 45.302563f, 87.15078f),
                    PathNode.CurveTo(39.201607f, 116.92664f, 54.88477f, 146.88643f, 82.83f, 158.84f),
                    PathNode.CurveTo(59.07f, 164.3f, 37.65f, 177.53f, 20.94f, 197.43f),
                    PathNode.CurveTo(19.944609f, 198.51366f, 19.624542f, 200.05632f, 20.106665f, 201.44652f),
                    PathNode.CurveTo(20.588785f, 202.83673f, 21.79524f, 203.84999f, 23.247835f, 204.0847f),
                    PathNode.CurveTo(24.70043f, 204.3194f, 26.164598f, 203.73764f, 27.06f, 202.57f),
                    PathNode.CurveTo(48.0f, 177.7f, 76.71f, 164.0f, 108.0f, 164.0f),
                    PathNode.CurveTo(139.29f, 164.0f, 168.0f, 177.7f, 188.94f, 202.57f),
                    PathNode.CurveTo(190.38774f, 204.14612f, 192.81958f, 204.3035f, 194.45839f, 202.92711f),
                    PathNode.CurveTo(196.0972f, 201.55072f, 196.3623f, 199.12827f, 195.06f, 197.43f),
                    PathNode.CurveTo(178.35f, 177.53f, 156.93f, 164.3f, 133.17f, 158.84f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 100.0f),
                    PathNode.CurveTo(52.0f, 69.07206f, 77.07206f, 44.0f, 108.0f, 44.0f),
                    PathNode.CurveTo(138.92795f, 44.0f, 164.0f, 69.07206f, 164.0f, 100.0f),
                    PathNode.CurveTo(164.0f, 130.92795f, 138.92795f, 156.0f, 108.0f, 156.0f),
                    PathNode.CurveTo(77.08576f, 155.96693f, 52.03307f, 130.91423f, 52.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(250.83f, 130.83f),
                    PathNode.LineTo(218.83f, 162.83f),
                    PathNode.CurveTo(218.07973f, 163.58112f, 217.06163f, 164.00314f, 216.0f, 164.00314f),
                    PathNode.CurveTo(214.93837f, 164.00314f, 213.92027f, 163.58112f, 213.17f, 162.83f),
                    PathNode.LineTo(197.17f, 146.83f),
                    PathNode.CurveTo(195.60704f, 145.26703f, 195.60704f, 142.73297f, 197.17f, 141.17f),
                    PathNode.CurveTo(198.73297f, 139.60704f, 201.26703f, 139.60704f, 202.83f, 141.17f),
                    PathNode.LineTo(216.0f, 154.34f),
                    PathNode.LineTo(245.17f, 125.17f),
                    PathNode.CurveTo(246.73297f, 123.60703f, 249.26703f, 123.60703f, 250.83f, 125.17f),
                    PathNode.CurveTo(252.39296f, 126.73296f, 252.39296f, 129.26703f, 250.83f, 130.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
