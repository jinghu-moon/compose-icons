package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorFillIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 144.0f),
                    PathNode.CurveTo(239.99255f, 164.17117f, 229.13765f, 182.77972f, 211.58304f, 192.71512f),
                    PathNode.CurveTo(194.02844f, 202.65051f, 172.48701f, 202.37735f, 155.19f, 192.0f),
                    PathNode.LineTo(150.75f, 192.0f),
                    PathNode.LineTo(159.66f, 221.7f),
                    PathNode.CurveTo(160.387f, 224.12192f, 159.92615f, 226.74496f, 158.41714f, 228.77403f),
                    PathNode.CurveTo(156.90816f, 230.8031f, 154.52867f, 231.99928f, 152.0f, 232.0f),
                    PathNode.LineTo(104.0f, 232.0f),
                    PathNode.CurveTo(101.47132f, 231.99928f, 99.09185f, 230.8031f, 97.582855f, 228.77403f),
                    PathNode.CurveTo(96.07385f, 226.74496f, 95.61301f, 224.12192f, 96.34f, 221.7f),
                    PathNode.LineTo(105.25f, 192.0f),
                    PathNode.LineTo(100.81f, 192.0f),
                    PathNode.CurveTo(80.524605f, 204.18999f, 54.766167f, 202.31184f, 36.463566f, 187.30824f),
                    PathNode.CurveTo(18.160967f, 172.30464f, 11.266105f, 147.41518f, 19.239708f, 125.13257f),
                    PathNode.CurveTo(27.213312f, 102.84996f, 48.333717f, 87.985466f, 72.0f, 88.0f),
                    PathNode.CurveTo(72.78f, 88.0f, 73.55f, 88.0f, 74.33f, 88.0f),
                    PathNode.CurveTo(67.50153f, 65.073746f, 75.98989f, 40.3415f, 95.457855f, 26.440447f),
                    PathNode.CurveTo(114.92582f, 12.539397f, 141.07417f, 12.539397f, 160.54214f, 26.440447f),
                    PathNode.CurveTo(180.01012f, 40.3415f, 188.49847f, 65.073746f, 181.67f, 88.0f),
                    PathNode.CurveTo(182.44f, 88.0f, 183.22f, 88.0f, 184.0f, 88.0f),
                    PathNode.CurveTo(214.91423f, 88.033066f, 239.96693f, 113.08576f, 240.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _club!!
    }

private var _club: ImageVector? = null
