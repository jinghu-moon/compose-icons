package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TemperatureMinus: ImageVector
    get() {
        if (_temperatureMinus != null) return _temperatureMinus!!
        _temperatureMinus = tablerFilledIcon(
            name = "TemperatureMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.CurveTo(11.656855f, 2.0f, 13.0f, 3.343146f, 13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 12.965f),
                    PathNode.LineTo(13.075f, 13.021f),
                    PathNode.CurveTo(14.591761f, 14.20384f, 15.29554f, 16.15187f, 14.885f, 18.031f),
                    PathNode.LineTo(14.83f, 18.258f),
                    PathNode.CurveTo(14.266193f, 20.360926f, 12.40641f, 21.857283f, 10.23154f, 21.95786f),
                    PathNode.CurveTo(8.056669f, 22.058437f, 6.06672f, 20.740112f, 5.311234f, 18.698196f),
                    PathNode.CurveTo(4.555748f, 16.656282f, 5.208413f, 14.360219f, 6.925f, 13.021f),
                    PathNode.LineTo(7.0f, 12.965f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(6.999912f, 3.411442f, 8.238179f, 2.098195f, 9.824f, 2.005f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.552284f, 8.0f, 23.0f, 8.447715f, 23.0f, 9.0f),
                    PathNode.CurveTo(23.0f, 9.552285f, 22.552284f, 10.0f, 22.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(15.447715f, 10.0f, 15.0f, 9.552285f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 8.447715f, 15.447715f, 8.0f, 16.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.447715f, 4.0f, 9.0f, 4.447716f, 9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(11.0f, 4.447716f, 10.552285f, 4.0f, 10.0f, 4.0f)
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
        return _temperatureMinus!!
    }

private var _temperatureMinus: ImageVector? = null
