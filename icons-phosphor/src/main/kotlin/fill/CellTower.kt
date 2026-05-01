package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorFillIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(159.49f, 93.74f),
                    PathNode.CurveTo(161.7426f, 81.147156f, 156.27872f, 68.42273f, 145.59633f, 61.38419f),
                    PathNode.CurveTo(134.91396f, 54.34565f, 121.06604f, 54.34565f, 110.38367f, 61.38419f),
                    PathNode.CurveTo(99.70129f, 68.42273f, 94.2374f, 81.147156f, 96.49f, 93.74f),
                    PathNode.CurveTo(97.07107f, 96.582306f, 96.06783f, 99.51645f, 93.8682f, 101.408f),
                    PathNode.CurveTo(91.66856f, 103.299545f, 88.61727f, 103.852036f, 85.89404f, 102.85185f),
                    PathNode.CurveTo(83.17081f, 101.85168f, 81.20245f, 99.4556f, 80.75f, 96.59f),
                    PathNode.CurveTo(77.321815f, 77.68182f, 85.501f, 58.551357f, 101.53909f, 47.96594f),
                    PathNode.CurveTo(117.577194f, 37.38052f, 138.38281f, 37.38052f, 154.4209f, 47.96594f),
                    PathNode.CurveTo(170.45898f, 58.551357f, 178.63818f, 77.68182f, 175.21f, 96.59f),
                    PathNode.CurveTo(174.52385f, 100.394264f, 171.21565f, 103.163734f, 167.35f, 103.17f),
                    PathNode.CurveTo(166.87057f, 103.16596f, 166.39229f, 103.12248f, 165.92f, 103.04f),
                    PathNode.CurveTo(161.57796f, 102.24488f, 158.70049f, 98.08307f, 159.49f, 93.74f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
