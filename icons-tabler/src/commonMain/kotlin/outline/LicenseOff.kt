package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LicenseOff: ImageVector
    get() {
        if (_licenseOff != null) return _licenseOff!!
        _licenseOff = tablerOutlineIcon(
            name = "LicenseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 20.10457f, 13.895431f, 21.0f, 15.0f, 21.0f),
                    PathNode.CurveTo(16.10457f, 21.0f, 17.0f, 20.10457f, 17.0f, 19.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 3.895431f, 17.89543f, 3.0f, 19.0f, 3.0f),
                    PathNode.CurveTo(20.10457f, 3.0f, 21.0f, 3.895431f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 6.10457f, 20.10457f, 7.0f, 19.0f, 7.0f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.LineTo(8.0f, 3.0f),
                    PathNode.CurveTo(7.707397f, 2.99964f, 7.416314f, 3.04209f, 7.136f, 3.126f),
                    PathNode.MoveTo(5.122f, 5.151f),
                    PathNode.CurveTo(5.040879f, 5.426696f, 4.999792f, 5.712618f, 5.0f, 6.0f),
                    PathNode.LineTo(5.0f, 17.0f)
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
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f)
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
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f)
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
        return _licenseOff!!
    }

private var _licenseOff: ImageVector? = null
