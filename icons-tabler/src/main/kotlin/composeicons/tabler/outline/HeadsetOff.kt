package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadsetOff: ImageVector
    get() {
        if (_headsetOff != null) return _headsetOff!!
        _headsetOff = tablerOutlineIcon(
            name = "HeadsetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(4.0f, 9.047f, 4.7f, 7.258f, 5.862f, 5.87f),
                    PathNode.MoveTo(8.044f, 4.045f),
                    PathNode.CurveTo(10.520591f, 2.635997f, 13.559683f, 2.650596f, 16.022623f, 4.083328f),
                    PathNode.CurveTo(18.485561f, 5.51606f, 20.000563f, 8.150651f, 20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 20.657f, 15.314f, 22.0f, 12.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.CurveTo(4.0f, 12.895431f, 4.895431f, 12.0f, 6.0f, 12.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(8.10457f, 12.0f, 9.0f, 12.895431f, 9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.10457f, 8.10457f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(4.895431f, 19.0f, 4.0f, 18.10457f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.169f, 12.18f),
                    PathNode.CurveTo(16.422f, 12.065f, 16.703f, 12.0f, 17.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(19.10457f, 12.0f, 20.0f, 12.895431f, 20.0f, 14.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(18.817f, 18.826f),
                    PathNode.CurveTo(18.567f, 18.938f, 18.291f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(15.895431f, 19.0f, 15.0f, 18.10457f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null
