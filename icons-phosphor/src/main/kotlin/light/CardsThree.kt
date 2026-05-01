package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CardsThree: ImageVector
    get() {
        if (_cardsThree != null) return _cardsThree!!
        _cardsThree = phosphorLightIcon(
            name = "CardsThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 90.0f),
                    PathNode.LineTo(48.0f, 90.0f),
                    PathNode.CurveTo(40.268013f, 90.0f, 34.0f, 96.26801f, 34.0f, 104.0f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 207.73198f, 40.268013f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(215.73198f, 214.0f, 222.0f, 207.73198f, 222.0f, 200.0f),
                    PathNode.LineTo(222.0f, 104.0f),
                    PathNode.CurveTo(222.0f, 96.26801f, 215.73198f, 90.0f, 208.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 200.0f),
                    PathNode.CurveTo(210.0f, 201.10457f, 209.10457f, 202.0f, 208.0f, 202.0f),
                    PathNode.LineTo(48.0f, 202.0f),
                    PathNode.CurveTo(46.89543f, 202.0f, 46.0f, 201.10457f, 46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 104.0f),
                    PathNode.CurveTo(46.0f, 102.89543f, 46.89543f, 102.0f, 48.0f, 102.0f),
                    PathNode.LineTo(208.0f, 102.0f),
                    PathNode.CurveTo(209.10457f, 102.0f, 210.0f, 102.89543f, 210.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.0f, 64.0f),
                    PathNode.CurveTo(50.0f, 60.68629f, 52.68629f, 58.0f, 56.0f, 58.0f),
                    PathNode.LineTo(200.0f, 58.0f),
                    PathNode.CurveTo(203.3137f, 58.0f, 206.0f, 60.68629f, 206.0f, 64.0f),
                    PathNode.CurveTo(206.0f, 67.313705f, 203.3137f, 70.0f, 200.0f, 70.0f),
                    PathNode.LineTo(56.0f, 70.0f),
                    PathNode.CurveTo(52.68629f, 70.0f, 50.0f, 67.313705f, 50.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 32.0f),
                    PathNode.CurveTo(66.0f, 28.68629f, 68.686295f, 26.0f, 72.0f, 26.0f),
                    PathNode.LineTo(184.0f, 26.0f),
                    PathNode.CurveTo(187.3137f, 26.0f, 190.0f, 28.68629f, 190.0f, 32.0f),
                    PathNode.CurveTo(190.0f, 35.31371f, 187.3137f, 38.0f, 184.0f, 38.0f),
                    PathNode.LineTo(72.0f, 38.0f),
                    PathNode.CurveTo(68.686295f, 38.0f, 66.0f, 35.31371f, 66.0f, 32.0f),
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
        return _cardsThree!!
    }

private var _cardsThree: ImageVector? = null
