package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ScubaDivingTank: ImageVector
    get() {
        if (_scubaDivingTank != null) return _scubaDivingTank!!
        _scubaDivingTank = tablerFilledIcon(
            name = "ScubaDivingTank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 17.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.656855f, 15.656855f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(10.0f, 22.0f),
                    PathNode.CurveTo(8.343146f, 22.0f, 7.0f, 20.656855f, 7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 17.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 2.0f),
                    PathNode.CurveTo(8.714513f, 2.000018f, 9.374743f, 2.381214f, 9.732f, 3.0f),
                    PathNode.LineTo(10.882f, 3.0f),
                    PathNode.CurveTo(11.165889f, 2.680706f, 11.572751f, 2.498028f, 12.0f, 2.498028f),
                    PathNode.CurveTo(12.427249f, 2.498028f, 12.834111f, 2.680706f, 13.118f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.CurveTo(15.552285f, 3.0f, 16.0f, 3.447715f, 16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 4.552285f, 15.552285f, 5.0f, 15.0f, 5.0f),
                    PathNode.LineTo(13.117f, 5.001f),
                    PathNode.CurveTo(13.080262f, 5.041217f, 13.041897f, 5.079916f, 13.002f, 5.117f),
                    PathNode.LineTo(13.002f, 6.1f),
                    PathNode.CurveTo(15.329536f, 6.576096f, 17.00068f, 8.62427f, 17.0f, 11.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(6.999515f, 8.623657f, 8.671669f, 6.575269f, 11.0f, 6.1f),
                    PathNode.LineTo(11.0f, 5.117f),
                    PathNode.CurveTo(10.959423f, 5.079957f, 10.92039f, 5.041258f, 10.883f, 5.001f),
                    PathNode.LineTo(9.732f, 5.001f),
                    PathNode.CurveTo(9.246327f, 5.84109f, 8.227684f, 6.211341f, 7.315929f, 5.879182f),
                    PathNode.CurveTo(6.404172f, 5.547023f, 5.862397f, 4.608301f, 6.030917f, 3.652671f),
                    PathNode.CurveTo(6.199437f, 2.69704f, 7.029625f, 2.000256f, 8.0f, 2.0f)
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
        return _scubaDivingTank!!
    }

private var _scubaDivingTank: ImageVector? = null
