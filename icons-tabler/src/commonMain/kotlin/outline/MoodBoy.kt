package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodBoy: ImageVector
    get() {
        if (_moodBoy != null) return _moodBoy!!
        _moodBoy = tablerOutlineIcon(
            name = "MoodBoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 4.5f),
                    PathNode.CurveTo(19.03477f, 5.856787f, 20.429766f, 7.983218f, 20.864f, 10.39f),
                    PathNode.CurveTo(21.62606f, 10.882756f, 22.06125f, 11.74978f, 22.001022f, 12.655272f),
                    PathNode.CurveTo(21.940796f, 13.560764f, 21.394608f, 14.362514f, 20.574f, 14.75f),
                    PathNode.CurveTo(19.37789f, 18.472363f, 15.915316f, 20.996674f, 12.0055f, 20.996674f),
                    PathNode.CurveTo(8.095684f, 20.996674f, 4.633111f, 18.472363f, 3.437f, 14.75f),
                    PathNode.CurveTo(2.616392f, 14.362514f, 2.070205f, 13.560764f, 2.009977f, 12.655272f),
                    PathNode.CurveTo(1.949749f, 11.74978f, 2.38494f, 10.882756f, 3.147f, 10.39f),
                    PathNode.CurveTo(3.572441f, 8.031881f, 4.920685f, 5.940772f, 6.893f, 4.58f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.5f, 16.0f),
                    PathNode.CurveTo(10.158311f, 16.671886f, 11.05936f, 17.05051f, 12.0f, 17.05051f),
                    PathNode.CurveTo(12.94064f, 17.05051f, 13.841689f, 16.671886f, 14.5f, 16.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.5f, 2.0f),
                    PathNode.CurveTo(10.0f, 3.0f, 11.0f, 5.5f, 11.0f, 7.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 2.0f),
                    PathNode.CurveTo(14.0f, 4.0f, 14.5f, 5.5f, 14.5f, 7.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(9.01f, 12.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(15.01f, 12.0f)
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
        return _moodBoy!!
    }

private var _moodBoy: ImageVector? = null
