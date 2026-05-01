package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Meeple: ImageVector
    get() {
        if (_meeple != null) return _meeple!!
        _meeple = tablerFilledIcon(
            name = "Meeple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(14.486f, 2.0f, 15.713f, 3.766f, 15.955f, 6.1f),
                    PathNode.LineTo(15.965f, 6.224f),
                    PathNode.LineTo(16.094f, 6.26f),
                    PathNode.CurveTo(19.264f, 7.188f, 21.848f, 8.747f, 21.994f, 10.816f),
                    PathNode.LineTo(22.0f, 11.0f),
                    PathNode.CurveTo(22.0f, 12.427f, 20.703f, 13.322f, 19.129f, 13.733f),
                    PathNode.LineTo(18.928f, 13.782f),
                    PathNode.LineTo(18.954f, 13.812f),
                    PathNode.CurveTo(19.198f, 14.088f, 19.486f, 14.415f, 19.654f, 14.609f),
                    PathNode.LineTo(19.711f, 14.675f),
                    PathNode.CurveTo(20.201f, 15.248f, 20.595f, 15.748f, 20.927f, 16.235f),
                    PathNode.CurveTo(21.617f, 17.245f, 22.0f, 18.139f, 22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.10457f, 21.10457f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(13.957f, 21.0f, 13.656f, 20.547f, 12.606f, 18.447f),
                    PathNode.CurveTo(12.316f, 17.867f, 12.158f, 17.565f, 12.013f, 17.329f),
                    PathNode.LineTo(12.0f, 17.307f),
                    PathNode.LineTo(11.987f, 17.329f),
                    PathNode.CurveTo(11.858f, 17.539f, 11.719f, 17.801f, 11.487f, 18.264f),
                    PathNode.LineTo(11.394f, 18.447f),
                    PathNode.CurveTo(10.344f, 20.547f, 10.043f, 21.0f, 9.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(2.895431f, 21.0f, 2.0f, 20.10457f, 2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 18.14f, 2.384f, 17.245f, 3.073f, 16.235f),
                    PathNode.CurveTo(3.449435f, 15.693106f, 3.855381f, 15.17232f, 4.289f, 14.675f),
                    PathNode.CurveTo(4.441f, 14.497f, 4.771f, 14.122f, 5.046f, 13.812f),
                    PathNode.LineTo(5.071f, 13.782f),
                    PathNode.LineTo(4.871f, 13.733f),
                    PathNode.CurveTo(3.365f, 13.34f, 2.113f, 12.503f, 2.007f, 11.183f),
                    PathNode.LineTo(2.0f, 11.0f),
                    PathNode.CurveTo(2.0f, 8.84f, 4.643f, 7.215f, 7.906f, 6.26f),
                    PathNode.LineTo(8.034001f, 6.224f),
                    PathNode.LineTo(8.045f, 6.1f),
                    PathNode.CurveTo(8.28f, 3.84f, 9.439f, 2.11f, 11.771f, 2.005f),
                    PathNode.Close
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
        return _meeple!!
    }

private var _meeple: ImageVector? = null
