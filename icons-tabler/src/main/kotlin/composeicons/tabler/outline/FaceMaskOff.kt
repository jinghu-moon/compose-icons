package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FaceMaskOff: ImageVector
    get() {
        if (_faceMaskOff != null) return _faceMaskOff!!
        _faceMaskOff = tablerOutlineIcon(
            name = "FaceMaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 14.5f),
                    PathNode.LineTo(4.778f, 14.5f),
                    PathNode.CurveTo(3.243f, 14.5f, 2.0f, 13.38f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 10.62f, 3.243f, 9.5f, 4.778f, 9.5f),
                    PathNode.LineTo(5.0f, 9.5f)
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
                    PathNode.MoveTo(19.0f, 14.5f),
                    PathNode.LineTo(19.222f, 14.5f),
                    PathNode.CurveTo(20.756f, 14.5f, 22.0f, 13.38f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 10.62f, 20.756f, 9.5f, 19.222f, 9.5f),
                    PathNode.LineTo(19.0f, 9.5f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f)
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
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 8.51f),
                    PathNode.CurveTo(19.00005f, 7.617213f, 18.408365f, 6.832517f, 17.55f, 6.587f),
                    PathNode.LineTo(12.55f, 5.158f),
                    PathNode.CurveTo(12.190541f, 5.055185f, 11.809459f, 5.055185f, 11.45f, 5.158f),
                    PathNode.LineTo(9.662f, 5.669f),
                    PathNode.MoveTo(6.544f, 6.56f),
                    PathNode.LineTo(6.45f, 6.587f),
                    PathNode.CurveTo(5.591992f, 6.832415f, 5.000397f, 7.616584f, 5.0f, 8.509f),
                    PathNode.LineTo(5.0f, 15.491f),
                    PathNode.CurveTo(4.999951f, 16.383787f, 5.591635f, 17.168484f, 6.45f, 17.414f),
                    PathNode.LineTo(11.45f, 18.843f),
                    PathNode.CurveTo(11.809459f, 18.945816f, 12.190541f, 18.945816f, 12.55f, 18.843f),
                    PathNode.LineTo(17.449f, 17.443f)
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
        return _faceMaskOff!!
    }

private var _faceMaskOff: ImageVector? = null
