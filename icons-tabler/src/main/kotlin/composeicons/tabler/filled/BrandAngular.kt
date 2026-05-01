package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) return _brandAngular!!
        _brandAngular = tablerFilledIcon(
            name = "BrandAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.665f, 2.174f),
                    PathNode.LineTo(20.065f, 4.786f),
                    PathNode.CurveTo(20.959404f, 5.101697f, 21.509062f, 6.0022f, 21.381f, 6.942f),
                    PathNode.LineTo(20.058f, 16.645f),
                    PathNode.CurveTo(19.974379f, 17.261715f, 19.60843f, 17.804354f, 19.068f, 18.113f),
                    PathNode.LineTo(12.992f, 21.584f),
                    PathNode.CurveTo(12.377276f, 21.93514f, 11.622724f, 21.93514f, 11.008f, 21.584f),
                    PathNode.LineTo(4.932f, 18.114f),
                    PathNode.CurveTo(4.443381f, 17.835f, 4.094888f, 17.36308f, 3.972f, 16.814f),
                    PathNode.LineTo(3.942f, 16.647f),
                    PathNode.LineTo(2.62f, 6.943f),
                    PathNode.CurveTo(2.491938f, 6.0032f, 3.041596f, 5.102697f, 3.936f, 4.787f),
                    PathNode.LineTo(11.336f, 2.174f),
                    PathNode.CurveTo(11.766352f, 2.022276f, 12.235648f, 2.022276f, 12.666f, 2.174f),
                    PathNode.MoveTo(12.937f, 6.649f),
                    PathNode.CurveTo(12.613f, 5.784f, 11.389f, 5.784f, 11.065f, 6.649f),
                    PathNode.LineTo(8.065f, 14.649f),
                    PathNode.CurveTo(7.871358f, 15.165932f, 8.133205f, 15.741995f, 8.65f, 15.936f),
                    PathNode.LineTo(8.761f, 15.971f),
                    PathNode.CurveTo(9.253515f, 16.092535f, 9.759004f, 15.826036f, 9.937f, 15.351f),
                    PathNode.LineTo(10.443f, 14.0f),
                    PathNode.LineTo(13.556f, 14.0f),
                    PathNode.LineTo(14.064f, 15.352f),
                    PathNode.CurveTo(14.241996f, 15.827037f, 14.747484f, 16.093536f, 15.24f, 15.972f),
                    PathNode.LineTo(15.351f, 15.937f),
                    PathNode.CurveTo(15.867795f, 15.742994f, 16.129642f, 15.166931f, 15.936f, 14.65f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.848f),
                    PathNode.LineTo(12.807f, 11.999f),
                    PathNode.LineTo(11.193f, 11.999f),
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
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
