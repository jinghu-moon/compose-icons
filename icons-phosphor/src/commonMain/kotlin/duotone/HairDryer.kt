package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorDuotoneIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 32.0f),
                    PathNode.LineTo(30.68f, 54.89f),
                    PathNode.CurveTo(26.824837f, 55.534943f, 24.00017f, 58.87126f, 24.0f, 62.78f),
                    PathNode.LineTo(24.0f, 113.22f),
                    PathNode.CurveTo(24.00017f, 117.12874f, 26.824837f, 120.46506f, 30.68f, 121.11f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(198.92795f, 144.0f, 224.0f, 118.92794f, 224.0f, 88.0f),
                    PathNode.CurveTo(224.0f, 57.072056f, 198.92795f, 32.0f, 168.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.CurveTo(154.74516f, 112.0f, 144.0f, 101.25484f, 144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 74.74516f, 154.74516f, 64.0f, 168.0f, 64.0f),
                    PathNode.CurveTo(181.25484f, 64.0f, 192.0f, 74.74516f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 101.25484f, 181.25484f, 112.0f, 168.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 70.32689f, 185.67311f, 56.0f, 168.0f, 56.0f),
                    PathNode.CurveTo(150.32689f, 56.0f, 136.0f, 70.32689f, 136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 105.67311f, 150.32689f, 120.0f, 168.0f, 120.0f),
                    PathNode.CurveTo(185.67311f, 120.0f, 200.0f, 105.67311f, 200.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 104.0f),
                    PathNode.CurveTo(159.16344f, 104.0f, 152.0f, 96.836555f, 152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 79.163445f, 159.16344f, 72.0f, 168.0f, 72.0f),
                    PathNode.CurveTo(176.83656f, 72.0f, 184.0f, 79.163445f, 184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 96.836555f, 176.83656f, 104.0f, 168.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.42f, 206.62f),
                    PathNode.LineTo(209.0f, 137.07f),
                    PathNode.CurveTo(229.62622f, 119.79945f, 237.25034f, 91.47367f, 228.07979f, 66.18308f),
                    PathNode.CurveTo(218.90924f, 40.892494f, 194.90189f, 24.036507f, 168.0f, 24.0f),
                    PathNode.CurveTo(167.55779f, 24.001863f, 167.11642f, 24.038645f, 166.68f, 24.11f),
                    PathNode.LineTo(29.37f, 47.0f),
                    PathNode.CurveTo(21.655699f, 48.285522f, 16.001158f, 54.95932f, 16.0f, 62.78f),
                    PathNode.LineTo(16.0f, 113.22f),
                    PathNode.CurveTo(16.001158f, 121.04068f, 21.655699f, 127.71448f, 29.37f, 129.0f),
                    PathNode.LineTo(128.0f, 145.44f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 208.83656f, 135.16344f, 216.0f, 144.0f, 216.0f),
                    PathNode.CurveTo(144.0f, 238.09138f, 161.90862f, 256.0f, 184.0f, 256.0f),
                    PathNode.LineTo(200.0f, 256.0f),
                    PathNode.CurveTo(204.41827f, 256.0f, 208.0f, 252.41827f, 208.0f, 248.0f),
                    PathNode.CurveTo(208.0f, 243.58173f, 204.41827f, 240.0f, 200.0f, 240.0f),
                    PathNode.LineTo(184.0f, 240.0f),
                    PathNode.CurveTo(170.74516f, 240.0f, 160.0f, 229.25484f, 160.0f, 216.0f),
                    PathNode.LineTo(162.85f, 216.0f),
                    PathNode.CurveTo(169.12598f, 216.00146f, 174.8233f, 212.3336f, 177.42f, 206.62f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 62.78f),
                    PathNode.LineTo(168.64f, 40.0f),
                    PathNode.CurveTo(195.14967f, 40.0f, 216.64f, 61.490334f, 216.64f, 88.0f),
                    PathNode.CurveTo(216.64f, 114.50967f, 195.14967f, 136.0f, 168.64f, 136.0f),
                    PathNode.LineTo(32.0f, 113.23f),
                    PathNode.Close,
                    PathNode.MoveTo(166.68f, 151.89f),
                    PathNode.CurveTo(167.11642f, 151.96135f, 167.55779f, 151.99814f, 168.0f, 152.0f),
                    PathNode.CurveTo(174.03009f, 151.99838f, 180.0296f, 151.14323f, 185.82f, 149.46f),
                    PathNode.LineTo(162.82f, 200.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(144.0f, 148.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
