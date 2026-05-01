package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorLightIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(26.0f, 128.0f),
                    PathNode.CurveTo(26.044086f, 89.358345f, 57.358345f, 58.044086f, 96.0f, 58.0f),
                    PathNode.LineTo(209.51f, 58.0f),
                    PathNode.LineTo(195.76f, 44.24f),
                    PathNode.CurveTo(193.55713f, 41.875923f, 193.62213f, 38.19192f, 195.90703f, 35.907024f),
                    PathNode.CurveTo(198.19193f, 33.622128f, 201.87592f, 33.55713f, 204.24f, 35.76f),
                    PathNode.LineTo(228.24f, 59.76f),
                    PathNode.CurveTo(230.57962f, 62.10254f, 230.57962f, 65.89746f, 228.24f, 68.24f),
                    PathNode.LineTo(204.24f, 92.24f),
                    PathNode.CurveTo(201.87592f, 94.44287f, 198.19193f, 94.37787f, 195.90703f, 92.09297f),
                    PathNode.CurveTo(193.62213f, 89.808075f, 193.55713f, 86.12408f, 195.76f, 83.76f),
                    PathNode.LineTo(209.51f, 70.0f),
                    PathNode.LineTo(96.0f, 70.0f),
                    PathNode.CurveTo(63.983475f, 70.038574f, 38.03857f, 95.983475f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 131.3137f, 35.31371f, 134.0f, 32.0f, 134.0f),
                    PathNode.CurveTo(28.68629f, 134.0f, 26.0f, 131.3137f, 26.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 122.0f),
                    PathNode.CurveTo(220.6863f, 122.0f, 218.0f, 124.686295f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.96143f, 160.01653f, 192.01653f, 185.96143f, 160.0f, 186.0f),
                    PathNode.LineTo(46.49f, 186.0f),
                    PathNode.LineTo(60.24f, 172.24f),
                    PathNode.CurveTo(62.44287f, 169.87592f, 62.377872f, 166.19193f, 60.092976f, 163.90703f),
                    PathNode.CurveTo(57.80808f, 161.62213f, 54.124077f, 161.55713f, 51.76f, 163.76f),
                    PathNode.LineTo(27.76f, 187.76f),
                    PathNode.CurveTo(25.420374f, 190.10254f, 25.420374f, 193.89746f, 27.76f, 196.24f),
                    PathNode.LineTo(51.76f, 220.24f),
                    PathNode.CurveTo(54.124077f, 222.44287f, 57.80808f, 222.37787f, 60.092976f, 220.09297f),
                    PathNode.CurveTo(62.377872f, 217.80807f, 62.44287f, 214.12408f, 60.24f, 211.76f),
                    PathNode.LineTo(46.49f, 198.0f),
                    PathNode.LineTo(160.0f, 198.0f),
                    PathNode.CurveTo(198.64166f, 197.95592f, 229.95592f, 166.64166f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 124.686295f, 227.3137f, 122.0f, 224.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 158.0f),
                    PathNode.CurveTo(139.3137f, 158.0f, 142.0f, 155.3137f, 142.0f, 152.0f),
                    PathNode.LineTo(142.0f, 104.0f),
                    PathNode.CurveTo(142.00063f, 101.92086f, 140.92484f, 99.98961f, 139.15671f, 98.89574f),
                    PathNode.CurveTo(137.3886f, 97.801865f, 135.1802f, 97.70132f, 133.32f, 98.63f),
                    PathNode.LineTo(117.32f, 106.63f),
                    PathNode.CurveTo(115.33351f, 107.546745f, 114.00349f, 109.47209f, 113.8491f, 111.65445f),
                    PathNode.CurveTo(113.69471f, 113.836815f, 114.74043f, 115.93022f, 116.57808f, 117.1175f),
                    PathNode.CurveTo(118.41572f, 118.30479f, 120.75394f, 118.397705f, 122.68f, 117.36f),
                    PathNode.LineTo(130.0f, 113.7f),
                    PathNode.LineTo(130.0f, 152.0f),
                    PathNode.CurveTo(130.0f, 155.3137f, 132.6863f, 158.0f, 136.0f, 158.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
