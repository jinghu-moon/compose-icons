package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReportMoney: ImageVector
    get() {
        if (_reportMoney != null) return _reportMoney!!
        _reportMoney = tablerFilledIcon(
            name = "ReportMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.997f, 4.17f),
                    PathNode.CurveTo(19.197367f, 4.592963f, 20.000217f, 5.727295f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(3.999782f, 5.727295f, 4.802633f, 4.592963f, 6.003f, 4.17f),
                    PathNode.CurveTo(6.094089f, 6.31132f, 7.856744f, 8.000329f, 10.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(16.053223f, 8.000181f, 17.773138f, 6.445776f, 17.98f, 4.403f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(11.447715f, 10.0f, 11.0f, 10.447715f, 11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.05f),
                    PathNode.CurveTo(9.741303f, 11.305586f, 8.881065f, 12.473367f, 9.010144f, 13.751248f),
                    PathNode.CurveTo(9.139223f, 15.029129f, 10.215617f, 16.001291f, 11.5f, 16.0f),
                    PathNode.LineTo(12.5f, 16.0f),
                    PathNode.CurveTo(12.776142f, 16.0f, 13.0f, 16.223858f, 13.0f, 16.5f),
                    PathNode.CurveTo(13.0f, 16.776142f, 12.776142f, 17.0f, 12.5f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(9.447715f, 17.0f, 9.0f, 17.447716f, 9.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 18.552284f, 9.447715f, 19.0f, 10.0f, 19.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.CurveTo(11.0f, 19.552284f, 11.447715f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(12.552285f, 20.0f, 13.0f, 19.552284f, 13.0f, 19.0f),
                    PathNode.LineTo(13.0f, 18.95f),
                    PathNode.CurveTo(14.258697f, 18.694414f, 15.118935f, 17.526632f, 14.989856f, 16.248753f),
                    PathNode.CurveTo(14.860777f, 14.970871f, 13.784383f, 13.998709f, 12.5f, 14.0f),
                    PathNode.LineTo(11.5f, 14.0f),
                    PathNode.CurveTo(11.223858f, 14.0f, 11.0f, 13.776142f, 11.0f, 13.5f),
                    PathNode.CurveTo(11.0f, 13.223858f, 11.223858f, 13.0f, 11.5f, 13.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.552285f, 13.0f, 15.0f, 12.552285f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 11.447715f, 14.552285f, 11.0f, 14.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 10.447715f, 12.552285f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 5.10457f, 15.104569f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(8.895431f, 6.0f, 8.0f, 5.10457f, 8.0f, 4.0f),
                    PathNode.CurveTo(8.0f, 2.895431f, 8.895431f, 2.0f, 10.0f, 2.0f),
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
        return _reportMoney!!
    }

private var _reportMoney: ImageVector? = null
