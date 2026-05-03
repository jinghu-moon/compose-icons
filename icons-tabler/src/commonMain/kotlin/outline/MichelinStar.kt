package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) return _michelinStar!!
        _michelinStar = tablerOutlineIcon(
            name = "MichelinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.792f, 17.063f),
                    PathNode.CurveTo(14.792f, 17.4f, 14.849f, 17.681f, 14.849f, 17.963f),
                    PathNode.CurveTo(14.849f, 19.763f, 13.611f, 21.0f, 11.867f, 21.0f),
                    PathNode.CurveTo(10.067f, 21.0f, 8.887f, 19.762f, 8.887f, 17.794f),
                    PathNode.LineTo(8.887f, 17.063f),
                    PathNode.CurveTo(7.93f, 17.738f, 7.311f, 17.963f, 6.467f, 17.963f),
                    PathNode.CurveTo(4.949f, 17.963f, 3.542f, 16.5f, 3.542f, 14.869f),
                    PathNode.CurveTo(3.542f, 13.688f, 4.386f, 12.675f, 5.624f, 12.113f),
                    PathNode.LineTo(5.904f, 12.0f),
                    PathNode.CurveTo(4.33f, 11.213f, 3.542f, 10.312f, 3.542f, 9.075f),
                    PathNode.CurveTo(3.542f, 7.388f, 4.836f, 5.981f, 6.467f, 5.981f),
                    PathNode.CurveTo(7.142f, 5.981f, 7.987f, 6.319f, 8.605f, 6.769f),
                    PathNode.LineTo(8.886f, 6.881f),
                    PathNode.CurveTo(8.886f, 6.544f, 8.83f, 6.262f, 8.83f, 6.037f),
                    PathNode.CurveTo(8.83f, 4.237f, 10.067f, 3.0f, 11.81f, 3.0f),
                    PathNode.CurveTo(13.61f, 3.0f, 14.791f, 4.237f, 14.791f, 6.206f),
                    PathNode.LineTo(14.791f, 6.6f),
                    PathNode.LineTo(14.735f, 6.881f),
                    PathNode.CurveTo(15.691f, 6.206f, 16.31f, 5.981f, 17.154f, 5.981f),
                    PathNode.CurveTo(18.673f, 5.981f, 20.079f, 7.444f, 20.079f, 9.075f),
                    PathNode.CurveTo(20.079f, 10.256f, 19.235f, 11.269f, 17.998f, 11.831f),
                    PathNode.LineTo(17.716f, 12.0f),
                    PathNode.CurveTo(19.291f, 12.787f, 20.079f, 13.688f, 20.079f, 14.925f),
                    PathNode.CurveTo(20.079f, 16.613f, 18.785f, 18.019f, 17.154f, 18.019f),
                    PathNode.CurveTo(16.479f, 18.019f, 15.579f, 17.738f, 15.016f, 17.231f),
                    PathNode.LineTo(14.791f, 17.062f),
                    PathNode.LineTo(14.792f, 17.063f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
