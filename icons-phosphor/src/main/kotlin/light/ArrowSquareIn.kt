package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorLightIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(126.0f, 136.0f),
                    PathNode.LineTo(126.0f, 200.0f),
                    PathNode.CurveTo(126.0f, 203.3137f, 123.313705f, 206.0f, 120.0f, 206.0f),
                    PathNode.CurveTo(116.686295f, 206.0f, 114.0f, 203.3137f, 114.0f, 200.0f),
                    PathNode.LineTo(114.0f, 150.49f),
                    PathNode.LineTo(44.24f, 220.24f),
                    PathNode.CurveTo(41.875923f, 222.44287f, 38.19192f, 222.37787f, 35.907024f, 220.09297f),
                    PathNode.CurveTo(33.622128f, 217.80807f, 33.55713f, 214.12408f, 35.76f, 211.76f),
                    PathNode.LineTo(105.51f, 142.0f),
                    PathNode.LineTo(56.0f, 142.0f),
                    PathNode.CurveTo(52.68629f, 142.0f, 50.0f, 139.3137f, 50.0f, 136.0f),
                    PathNode.CurveTo(50.0f, 132.6863f, 52.68629f, 130.0f, 56.0f, 130.0f),
                    PathNode.LineTo(120.0f, 130.0f),
                    PathNode.CurveTo(123.313705f, 130.0f, 126.0f, 132.6863f, 126.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(80.0f, 34.0f),
                    PathNode.CurveTo(72.26801f, 34.0f, 66.0f, 40.268013f, 66.0f, 48.0f),
                    PathNode.LineTo(66.0f, 96.0f),
                    PathNode.CurveTo(66.0f, 99.313705f, 68.686295f, 102.0f, 72.0f, 102.0f),
                    PathNode.CurveTo(75.313705f, 102.0f, 78.0f, 99.313705f, 78.0f, 96.0f),
                    PathNode.LineTo(78.0f, 48.0f),
                    PathNode.CurveTo(78.0f, 46.89543f, 78.89543f, 46.0f, 80.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 176.0f),
                    PathNode.CurveTo(210.0f, 177.10457f, 209.10457f, 178.0f, 208.0f, 178.0f),
                    PathNode.LineTo(160.0f, 178.0f),
                    PathNode.CurveTo(156.6863f, 178.0f, 154.0f, 180.6863f, 154.0f, 184.0f),
                    PathNode.CurveTo(154.0f, 187.3137f, 156.6863f, 190.0f, 160.0f, 190.0f),
                    PathNode.LineTo(208.0f, 190.0f),
                    PathNode.CurveTo(215.73198f, 190.0f, 222.0f, 183.73198f, 222.0f, 176.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
