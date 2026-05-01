package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorDuotoneIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 88.0f),
                    PathNode.CurveTo(200.0006f, 115.2719f, 184.5926f, 140.20338f, 160.2f, 152.4f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.LineTo(95.8f, 152.4f),
                    PathNode.CurveTo(64.06141f, 136.53032f, 48.617683f, 99.90252f, 59.412193f, 66.09921f),
                    PathNode.CurveTo(70.206696f, 32.295902f, 104.02039f, 11.397614f, 139.08252f, 16.859596f),
                    PathNode.CurveTo(174.14462f, 22.321577f, 199.99924f, 52.515003f, 200.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(135.16f, 84.42f),
                    PathNode.CurveTo(133.80669f, 81.70468f, 131.03387f, 79.988525f, 128.0f, 79.988525f),
                    PathNode.CurveTo(124.966125f, 79.988525f, 122.193306f, 81.70468f, 120.84f, 84.42f),
                    PathNode.LineTo(48.84f, 228.42f),
                    PathNode.CurveTo(46.86282f, 232.3716f, 48.4634f, 237.17783f, 52.415f, 239.155f),
                    PathNode.CurveTo(56.366596f, 241.13219f, 61.17282f, 239.5316f, 63.15f, 235.58f),
                    PathNode.LineTo(77.0f, 208.0f),
                    PathNode.LineTo(179.1f, 208.0f),
                    PathNode.LineTo(192.89f, 235.58f),
                    PathNode.CurveTo(194.23842f, 238.27481f, 196.98671f, 239.9833f, 200.0f, 240.0f),
                    PathNode.CurveTo(202.77232f, 239.9985f, 205.34625f, 238.56184f, 206.80273f, 236.20294f),
                    PathNode.CurveTo(208.25922f, 233.84402f, 208.39061f, 230.89923f, 207.15f, 228.42f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 105.89f),
                    PathNode.LineTo(155.06f, 160.0f),
                    PathNode.LineTo(100.94f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.0f, 192.0f),
                    PathNode.LineTo(93.0f, 176.0f),
                    PathNode.LineTo(163.1f, 176.0f),
                    PathNode.LineTo(171.1f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.54f, 93.74f),
                    PathNode.CurveTo(161.7926f, 81.147156f, 156.3287f, 68.42273f, 145.64633f, 61.38419f),
                    PathNode.CurveTo(134.96396f, 54.34565f, 121.116035f, 54.34565f, 110.43366f, 61.38419f),
                    PathNode.CurveTo(99.75129f, 68.42273f, 94.28739f, 81.147156f, 96.54f, 93.74f),
                    PathNode.CurveTo(97.12106f, 96.582306f, 96.11783f, 99.51645f, 93.918205f, 101.408f),
                    PathNode.CurveTo(91.71857f, 103.299545f, 88.667274f, 103.852036f, 85.94404f, 102.85185f),
                    PathNode.CurveTo(83.22081f, 101.85168f, 81.25245f, 99.4556f, 80.8f, 96.59f),
                    PathNode.CurveTo(77.37182f, 77.68182f, 85.550995f, 58.551357f, 101.589096f, 47.96594f),
                    PathNode.CurveTo(117.62719f, 37.38052f, 138.4328f, 37.38052f, 154.4709f, 47.96594f),
                    PathNode.CurveTo(170.509f, 58.551357f, 178.68819f, 77.68182f, 175.26f, 96.59f),
                    PathNode.CurveTo(174.57385f, 100.394264f, 171.26566f, 103.163734f, 167.4f, 103.17f),
                    PathNode.CurveTo(166.92058f, 103.16596f, 166.44229f, 103.12248f, 165.97f, 103.04f),
                    PathNode.CurveTo(163.87553f, 102.66976f, 162.01472f, 101.480705f, 160.7988f, 99.73562f),
                    PathNode.CurveTo(159.58286f, 97.990524f, 159.11191f, 95.83306f, 159.49f, 93.74f),
                    PathNode.Close,
                    PathNode.MoveTo(64.15f, 136.21f),
                    PathNode.CurveTo(39.255497f, 103.232086f, 43.570934f, 56.721485f, 74.10787f, 28.886723f),
                    PathNode.CurveTo(104.64481f, 1.051957f, 151.3552f, 1.051957f, 181.89214f, 28.886723f),
                    PathNode.CurveTo(212.42906f, 56.721485f, 216.7445f, 103.232086f, 191.85f, 136.21f),
                    PathNode.CurveTo(189.16068f, 139.6552f, 184.20418f, 140.30444f, 180.71825f, 137.66814f),
                    PathNode.CurveTo(177.23232f, 135.03185f, 176.50732f, 130.08585f, 179.09f, 126.56f),
                    PathNode.CurveTo(198.9962f, 100.175896f, 195.53795f, 62.973743f, 171.10962f, 40.7109f),
                    PathNode.CurveTo(146.68127f, 18.44806f, 109.318726f, 18.44806f, 84.89039f, 40.7109f),
                    PathNode.CurveTo(60.462048f, 62.973743f, 57.0038f, 100.175896f, 76.91f, 126.56f),
                    PathNode.CurveTo(79.492676f, 130.08585f, 78.767685f, 135.03185f, 75.28175f, 137.66814f),
                    PathNode.CurveTo(71.79582f, 140.30444f, 66.83932f, 139.6552f, 64.15f, 136.21f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
