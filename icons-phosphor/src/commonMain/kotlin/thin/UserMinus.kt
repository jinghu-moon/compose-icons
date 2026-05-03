package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorThinIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 136.0f),
                    PathNode.CurveTo(252.0f, 138.20914f, 250.20914f, 140.0f, 248.0f, 140.0f),
                    PathNode.LineTo(200.0f, 140.0f),
                    PathNode.CurveTo(197.79086f, 140.0f, 196.0f, 138.20914f, 196.0f, 136.0f),
                    PathNode.CurveTo(196.0f, 133.79086f, 197.79086f, 132.0f, 200.0f, 132.0f),
                    PathNode.LineTo(248.0f, 132.0f),
                    PathNode.CurveTo(250.20914f, 132.0f, 252.0f, 133.79086f, 252.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(195.06f, 197.43f),
                    PathNode.CurveTo(196.3623f, 199.12827f, 196.0972f, 201.55072f, 194.45839f, 202.92711f),
                    PathNode.CurveTo(192.81958f, 204.3035f, 190.38774f, 204.14612f, 188.94f, 202.57f),
                    PathNode.CurveTo(168.0f, 177.7f, 139.3f, 164.0f, 108.0f, 164.0f),
                    PathNode.CurveTo(76.7f, 164.0f, 48.0f, 177.7f, 27.06f, 202.57f),
                    PathNode.CurveTo(26.164598f, 203.73764f, 24.70043f, 204.3194f, 23.247835f, 204.0847f),
                    PathNode.CurveTo(21.79524f, 203.84999f, 20.588785f, 202.83673f, 20.106665f, 201.44652f),
                    PathNode.CurveTo(19.624542f, 200.05632f, 19.944609f, 198.51366f, 20.94f, 197.43f),
                    PathNode.CurveTo(37.65f, 177.53f, 59.07f, 164.3f, 82.83f, 158.84f),
                    PathNode.CurveTo(54.88477f, 146.88643f, 39.201607f, 116.92664f, 45.302563f, 87.15078f),
                    PathNode.CurveTo(51.403522f, 57.37491f, 77.60553f, 35.997234f, 108.0f, 35.997234f),
                    PathNode.CurveTo(138.39447f, 35.997234f, 164.59648f, 57.37491f, 170.69743f, 87.15078f),
                    PathNode.CurveTo(176.7984f, 116.92664f, 161.11523f, 146.88643f, 133.17f, 158.84f),
                    PathNode.CurveTo(156.93f, 164.3f, 178.35f, 177.53f, 195.06f, 197.43f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 156.0f),
                    PathNode.CurveTo(138.92795f, 156.0f, 164.0f, 130.92795f, 164.0f, 100.0f),
                    PathNode.CurveTo(164.0f, 69.07206f, 138.92795f, 44.0f, 108.0f, 44.0f),
                    PathNode.CurveTo(77.07206f, 44.0f, 52.0f, 69.07206f, 52.0f, 100.0f),
                    PathNode.CurveTo(52.03307f, 130.91423f, 77.08576f, 155.96693f, 108.0f, 156.0f),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
