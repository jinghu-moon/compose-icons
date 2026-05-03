package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorLightIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 104.0f),
                    PathNode.CurveTo(222.0f, 107.313705f, 219.3137f, 110.0f, 216.0f, 110.0f),
                    PathNode.CurveTo(212.6863f, 110.0f, 210.0f, 107.313705f, 210.0f, 104.0f),
                    PathNode.LineTo(210.0f, 54.49f),
                    PathNode.LineTo(140.25f, 124.24f),
                    PathNode.CurveTo(137.88593f, 126.44287f, 134.20192f, 126.37787f, 131.91702f, 124.09297f),
                    PathNode.CurveTo(129.63213f, 121.808075f, 129.56712f, 118.12408f, 131.77f, 115.76f),
                    PathNode.LineTo(201.51f, 46.0f),
                    PathNode.LineTo(152.0f, 46.0f),
                    PathNode.CurveTo(148.6863f, 46.0f, 146.0f, 43.31371f, 146.0f, 40.0f),
                    PathNode.CurveTo(146.0f, 36.68629f, 148.6863f, 34.0f, 152.0f, 34.0f),
                    PathNode.LineTo(216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 130.0f),
                    PathNode.CurveTo(180.6863f, 130.0f, 178.0f, 132.6863f, 178.0f, 136.0f),
                    PathNode.LineTo(178.0f, 208.0f),
                    PathNode.CurveTo(178.0f, 209.10457f, 177.10457f, 210.0f, 176.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 80.0f),
                    PathNode.CurveTo(46.0f, 78.89543f, 46.89543f, 78.0f, 48.0f, 78.0f),
                    PathNode.LineTo(120.0f, 78.0f),
                    PathNode.CurveTo(123.313705f, 78.0f, 126.0f, 75.313705f, 126.0f, 72.0f),
                    PathNode.CurveTo(126.0f, 68.686295f, 123.313705f, 66.0f, 120.0f, 66.0f),
                    PathNode.LineTo(48.0f, 66.0f),
                    PathNode.CurveTo(40.268013f, 66.0f, 34.0f, 72.26801f, 34.0f, 80.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(176.0f, 222.0f),
                    PathNode.CurveTo(183.73198f, 222.0f, 190.0f, 215.73198f, 190.0f, 208.0f),
                    PathNode.LineTo(190.0f, 136.0f),
                    PathNode.CurveTo(190.0f, 132.6863f, 187.3137f, 130.0f, 184.0f, 130.0f),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
