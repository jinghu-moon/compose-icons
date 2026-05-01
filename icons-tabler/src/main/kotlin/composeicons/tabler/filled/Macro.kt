package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Macro: ImageVector
    get() {
        if (_macro != null) return _macro!!
        _macro = tablerFilledIcon(
            name = "Macro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.994f, 2.888f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(17.999962f, 8.927789f, 15.886839f, 11.428035f, 13.0f, 11.916f),
                    PathNode.LineTo(13.0f, 16.102f),
                    PathNode.CurveTo(14.315159f, 14.755956f, 16.11812f, 13.997992f, 18.0f, 14.0f),
                    PathNode.CurveTo(18.552284f, 14.0f, 19.0f, 14.447715f, 19.0f, 15.0f),
                    PathNode.CurveTo(19.0f, 18.865993f, 15.865993f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.134007f, 22.0f, 5.0f, 18.865993f, 5.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 14.447715f, 5.447716f, 14.0f, 6.0f, 14.0f),
                    PathNode.CurveTo(7.96f, 14.0f, 9.731f, 14.805f, 11.002f, 16.103f),
                    PathNode.LineTo(11.0f, 11.917f),
                    PathNode.CurveTo(8.112788f, 11.428972f, 5.999551f, 8.928167f, 6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(5.999945f, 2.631113f, 6.202979f, 2.292154f, 6.528235f, 2.118126f),
                    PathNode.CurveTo(6.853492f, 1.944098f, 7.248142f, 1.963268f, 7.555f, 2.168f),
                    PathNode.LineTo(9.872f, 3.712f),
                    PathNode.LineTo(11.292f, 2.292f),
                    PathNode.CurveTo(11.64853f, 1.936071f, 12.21416f, 1.900933f, 12.612f, 2.21f),
                    PathNode.LineTo(12.707f, 2.293f),
                    PathNode.LineTo(14.127f, 3.712f),
                    PathNode.LineTo(16.445f, 2.168f),
                    PathNode.CurveTo(16.735224f, 1.973768f, 17.10575f, 1.945007f, 17.42247f, 2.092129f),
                    PathNode.CurveTo(17.73919f, 2.23925f, 17.956217f, 2.540939f, 17.995f, 2.888f),
                    PathNode.MoveTo(7.13f, 16.128f),
                    PathNode.LineTo(7.16f, 16.262f),
                    PathNode.CurveTo(7.631057f, 18.060493f, 9.059309f, 19.450249f, 10.87f, 19.872f),
                    PathNode.CurveTo(10.440079f, 18.01248f, 8.989059f, 16.559908f, 7.13f, 16.128f),
                    PathNode.MoveTo(16.872f, 16.13f),
                    PathNode.LineTo(16.738f, 16.16f),
                    PathNode.CurveTo(14.939506f, 16.631056f, 13.549751f, 18.05931f, 13.128f, 19.87f),
                    PathNode.CurveTo(14.98752f, 19.440079f, 16.440092f, 17.98906f, 16.872f, 16.13f)
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
        return _macro!!
    }

private var _macro: ImageVector? = null
