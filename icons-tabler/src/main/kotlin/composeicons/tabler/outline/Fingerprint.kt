package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fingerprint: ImageVector
    get() {
        if (_fingerprint != null) return _fingerprint!!
        _fingerprint = tablerOutlineIcon(
            name = "Fingerprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.9f, 7.0f),
                    PathNode.CurveTo(19.804453f, 8.501182f, 20.190918f, 10.257836f, 20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.CurveTo(19.99883f, 14.052871f, 20.274734f, 15.087512f, 20.8f, 16.0f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 8.790861f, 9.790861f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(14.209139f, 7.0f, 16.0f, 8.790861f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 14.163702f, 16.701778f, 16.26904f, 18.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.CurveTo(11.996808f, 15.859398f, 12.869249f, 18.651209f, 14.5f, 21.0f)
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
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.244704f, 17.089832f, 8.853927f, 19.120579f, 9.8f, 21.0f)
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
                    PathNode.MoveTo(4.9f, 19.0f),
                    PathNode.CurveTo(4.225249f, 16.730305f, 3.921339f, 14.366563f, 4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(3.992196f, 8.137983f, 5.513905f, 5.489821f, 7.990543f, 4.055434f),
                    PathNode.CurveTo(10.467182f, 2.621048f, 13.521418f, 2.618976f, 16.0f, 4.05f)
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
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
