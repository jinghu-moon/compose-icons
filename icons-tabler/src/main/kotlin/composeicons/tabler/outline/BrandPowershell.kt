package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPowershell: ImageVector
    get() {
        if (_brandPowershell != null) return _brandPowershell!!
        _brandPowershell = tablerOutlineIcon(
            name = "BrandPowershell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.887f, 20.0f),
                    PathNode.LineTo(16.755f, 20.0f),
                    PathNode.CurveTo(17.648f, 20.0f, 18.419f, 19.335f, 18.602f, 18.408f),
                    PathNode.LineTo(20.96f, 6.408f),
                    PathNode.CurveTo(21.172f, 5.327f, 20.518f, 4.268f, 19.498f, 4.042f),
                    PathNode.CurveTo(19.37157f, 4.014071f, 19.242477f, 3.999987f, 19.113f, 4.0f),
                    PathNode.LineTo(7.245f, 4.0f),
                    PathNode.CurveTo(6.352f, 4.0f, 5.581f, 4.665f, 5.398f, 5.592f),
                    PathNode.LineTo(3.04f, 17.592f),
                    PathNode.CurveTo(2.828f, 18.673f, 3.482f, 19.732f, 4.502f, 19.958f),
                    PathNode.CurveTo(4.629f, 19.986f, 4.758f, 20.0f, 4.887f, 20.0f)
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(7.0f, 16.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f)
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
        return _brandPowershell!!
    }

private var _brandPowershell: ImageVector? = null
