package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignatureOff: ImageVector
    get() {
        if (_signatureOff != null) return _signatureOff!!
        _signatureOff = tablerOutlineIcon(
            name = "SignatureOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(6.333f, 13.667f, 8.0f, 11.0f, 8.0f, 9.0f),
                    PathNode.CurveTo(8.0f, 8.606f, 7.983f, 8.265001f, 7.95f, 7.967f),
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 6.0f, 3.968f, 7.085f, 4.0f, 9.0f),
                    PathNode.CurveTo(4.034f, 11.048f, 5.658f, 13.877f, 6.5f, 15.0f),
                    PathNode.CurveTo(8.0f, 17.0f, 9.0f, 17.5f, 10.0f, 16.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.CurveTo(12.333f, 15.667f, 13.333f, 17.0f, 15.0f, 17.0f),
                    PathNode.CurveTo(15.219f, 17.0f, 15.708f, 16.659f, 16.231f, 16.258f),
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.303f, 16.245f, 20.64f, 16.677f, 21.0f, 17.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _signatureOff!!
    }

private var _signatureOff: ImageVector? = null
