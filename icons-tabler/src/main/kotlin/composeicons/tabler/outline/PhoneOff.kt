package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) return _phoneOff!!
        _phoneOff = tablerOutlineIcon(
            name = "PhoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(21.0f, 3.0f)
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
                    PathNode.MoveTo(5.831f, 14.161f),
                    PathNode.CurveTo(4.154459f, 11.752942f, 3.174847f, 8.928987f, 3.0f, 6.0f),
                    PathNode.CurveTo(3.0f, 4.895431f, 3.895431f, 4.0f, 5.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(8.5f, 10.5f),
                    PathNode.CurveTo(8.608f, 10.72f, 8.723f, 10.935f, 8.845f, 11.145f),
                    PathNode.MoveTo(10.596f, 13.422f),
                    PathNode.CurveTo(11.439f, 14.262f, 12.418f, 14.966f, 13.5f, 15.5f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.10457f, 19.10457f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(14.098115f, 20.766495f, 10.417524f, 19.109446f, 7.656f, 16.343f)
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
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
