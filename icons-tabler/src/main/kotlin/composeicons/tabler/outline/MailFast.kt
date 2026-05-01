package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MailFast: ImageVector
    get() {
        if (_mailFast != null) return _mailFast!!
        _mailFast = tablerOutlineIcon(
            name = "MailFast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.LineTo(5.0f, 11.0f)
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
                    PathNode.MoveTo(9.02f, 8.801f),
                    PathNode.LineTo(8.42f, 14.801f),
                    PathNode.CurveTo(8.363778f, 15.363239f, 8.548007f, 15.923026f, 8.927147f, 16.341986f),
                    PathNode.CurveTo(9.306288f, 16.760944f, 9.844956f, 16.99998f, 10.41f, 17.0f),
                    PathNode.LineTo(18.39f, 17.0f),
                    PathNode.CurveTo(19.417477f, 16.999962f, 20.277765f, 16.221378f, 20.38f, 15.199f),
                    PathNode.LineTo(20.98f, 9.199f),
                    PathNode.CurveTo(21.036222f, 8.636761f, 20.851994f, 8.076974f, 20.472853f, 7.658015f),
                    PathNode.CurveTo(20.093712f, 7.239055f, 19.555044f, 7.000022f, 18.99f, 7.0f),
                    PathNode.LineTo(11.01f, 7.0f),
                    PathNode.CurveTo(9.982523f, 7.000039f, 9.122234f, 7.778622f, 9.02f, 8.801f)
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
                    PathNode.MoveTo(9.8f, 7.5f),
                    PathNode.LineTo(12.782f, 10.78f),
                    PathNode.CurveTo(13.31719f, 11.36881f, 14.064373f, 11.720885f, 14.859162f, 11.758768f),
                    PathNode.CurveTo(15.653951f, 11.796651f, 16.431234f, 11.517237f, 17.02f, 10.982f),
                    PathNode.LineTo(20.3f, 8.0f)
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
        return _mailFast!!
    }

private var _mailFast: ImageVector? = null
