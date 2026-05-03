package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorLightIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(106.0f, 40.0f),
                    PathNode.CurveTo(106.0f, 36.68629f, 108.686295f, 34.0f, 112.0f, 34.0f),
                    PathNode.LineTo(144.0f, 34.0f),
                    PathNode.CurveTo(147.3137f, 34.0f, 150.0f, 36.68629f, 150.0f, 40.0f),
                    PathNode.CurveTo(150.0f, 43.31371f, 147.3137f, 46.0f, 144.0f, 46.0f),
                    PathNode.LineTo(112.0f, 46.0f),
                    PathNode.CurveTo(108.686295f, 46.0f, 106.0f, 43.31371f, 106.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 210.0f),
                    PathNode.LineTo(112.0f, 210.0f),
                    PathNode.CurveTo(108.686295f, 210.0f, 106.0f, 212.6863f, 106.0f, 216.0f),
                    PathNode.CurveTo(106.0f, 219.3137f, 108.686295f, 222.0f, 112.0f, 222.0f),
                    PathNode.LineTo(144.0f, 222.0f),
                    PathNode.CurveTo(147.3137f, 222.0f, 150.0f, 219.3137f, 150.0f, 216.0f),
                    PathNode.CurveTo(150.0f, 212.6863f, 147.3137f, 210.0f, 144.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(184.0f, 34.0f),
                    PathNode.CurveTo(180.6863f, 34.0f, 178.0f, 36.68629f, 178.0f, 40.0f),
                    PathNode.CurveTo(178.0f, 43.31371f, 180.6863f, 46.0f, 184.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 72.0f),
                    PathNode.CurveTo(210.0f, 75.313705f, 212.6863f, 78.0f, 216.0f, 78.0f),
                    PathNode.CurveTo(219.3137f, 78.0f, 222.0f, 75.313705f, 222.0f, 72.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 106.0f),
                    PathNode.CurveTo(212.6863f, 106.0f, 210.0f, 108.686295f, 210.0f, 112.0f),
                    PathNode.LineTo(210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 147.3137f, 212.6863f, 150.0f, 216.0f, 150.0f),
                    PathNode.CurveTo(219.3137f, 150.0f, 222.0f, 147.3137f, 222.0f, 144.0f),
                    PathNode.LineTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 108.686295f, 219.3137f, 106.0f, 216.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 150.0f),
                    PathNode.CurveTo(43.31371f, 150.0f, 46.0f, 147.3137f, 46.0f, 144.0f),
                    PathNode.LineTo(46.0f, 112.0f),
                    PathNode.CurveTo(46.0f, 108.686295f, 43.31371f, 106.0f, 40.0f, 106.0f),
                    PathNode.CurveTo(36.68629f, 106.0f, 34.0f, 108.686295f, 34.0f, 112.0f),
                    PathNode.LineTo(34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 147.3137f, 36.68629f, 150.0f, 40.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 184.0f),
                    PathNode.CurveTo(46.0f, 180.6863f, 43.31371f, 178.0f, 40.0f, 178.0f),
                    PathNode.CurveTo(36.68629f, 178.0f, 34.0f, 180.6863f, 34.0f, 184.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(72.0f, 222.0f),
                    PathNode.CurveTo(75.313705f, 222.0f, 78.0f, 219.3137f, 78.0f, 216.0f),
                    PathNode.CurveTo(78.0f, 212.6863f, 75.313705f, 210.0f, 72.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
