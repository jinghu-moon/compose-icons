package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorLightIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 90.0f),
                    PathNode.LineTo(214.0f, 90.0f),
                    PathNode.LineTo(214.0f, 64.0f),
                    PathNode.CurveTo(214.0f, 56.268013f, 207.73198f, 50.0f, 200.0f, 50.0f),
                    PathNode.LineTo(48.0f, 50.0f),
                    PathNode.CurveTo(40.268013f, 50.0f, 34.0f, 56.268013f, 34.0f, 64.0f),
                    PathNode.LineTo(34.0f, 90.0f),
                    PathNode.LineTo(16.0f, 90.0f),
                    PathNode.CurveTo(12.686292f, 90.0f, 10.0f, 92.686295f, 10.0f, 96.0f),
                    PathNode.CurveTo(10.0f, 99.313705f, 12.686292f, 102.0f, 16.0f, 102.0f),
                    PathNode.LineTo(34.0f, 102.0f),
                    PathNode.LineTo(34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 135.73198f, 40.268013f, 142.0f, 48.0f, 142.0f),
                    PathNode.LineTo(200.0f, 142.0f),
                    PathNode.CurveTo(207.73198f, 142.0f, 214.0f, 135.73198f, 214.0f, 128.0f),
                    PathNode.LineTo(214.0f, 102.0f),
                    PathNode.LineTo(232.0f, 102.0f),
                    PathNode.CurveTo(233.10457f, 102.0f, 234.0f, 102.89543f, 234.0f, 104.0f),
                    PathNode.LineTo(234.0f, 154.0f),
                    PathNode.CurveTo(233.99872f, 154.89168f, 233.4073f, 155.67479f, 232.55f, 155.92f),
                    PathNode.LineTo(132.15f, 184.6f),
                    PathNode.CurveTo(126.175f, 186.32965f, 122.04668f, 191.77986f, 122.0f, 198.0f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 198.0f),
                    PathNode.CurveTo(134.00128f, 197.10832f, 134.5927f, 196.32521f, 135.45f, 196.08f),
                    PathNode.LineTo(235.85f, 167.4f),
                    PathNode.CurveTo(241.825f, 165.67035f, 245.95332f, 160.22014f, 246.0f, 154.0f),
                    PathNode.LineTo(246.0f, 104.0f),
                    PathNode.CurveTo(246.0f, 96.26801f, 239.73198f, 90.0f, 232.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 128.0f),
                    PathNode.CurveTo(202.0f, 129.10457f, 201.10457f, 130.0f, 200.0f, 130.0f),
                    PathNode.LineTo(48.0f, 130.0f),
                    PathNode.CurveTo(46.89543f, 130.0f, 46.0f, 129.10457f, 46.0f, 128.0f),
                    PathNode.LineTo(46.0f, 64.0f),
                    PathNode.CurveTo(46.0f, 62.89543f, 46.89543f, 62.0f, 48.0f, 62.0f),
                    PathNode.LineTo(200.0f, 62.0f),
                    PathNode.CurveTo(201.10457f, 62.0f, 202.0f, 62.89543f, 202.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
