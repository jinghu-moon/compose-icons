package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FingerprintOff: ImageVector
    get() {
        if (_fingerprintOff != null) return _fingerprintOff!!
        _fingerprintOff = tablerOutlineIcon(
            name = "FingerprintOff",
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 10.152f, 8.264f, 9.366f, 8.713f, 8.72f),
                    PathNode.MoveTo(11.113f, 7.099f),
                    PathNode.CurveTo(12.299552f, 6.829164f, 13.544411f, 7.11412f, 14.495424f, 7.873257f),
                    PathNode.CurveTo(15.446438f, 8.632395f, 16.000177f, 9.783154f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.CurveTo(11.996808f, 15.859398f, 12.869249f, 18.651209f, 14.5f, 21.0f)
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
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.244704f, 17.089832f, 8.853927f, 19.120579f, 9.8f, 21.0f)
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
                    PathNode.MoveTo(4.9f, 19.0f),
                    PathNode.CurveTo(4.225249f, 16.730305f, 3.921339f, 14.366563f, 4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(3.994888f, 9.121143f, 4.651237f, 7.300431f, 5.854f, 5.857f),
                    PathNode.MoveTo(8.03f, 4.032f),
                    PathNode.CurveTo(10.500773f, 2.620025f, 13.535629f, 2.626879f, 16.0f, 4.05f)
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
        return _fingerprintOff!!
    }

private var _fingerprintOff: ImageVector? = null
