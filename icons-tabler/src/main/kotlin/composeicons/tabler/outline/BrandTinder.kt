package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) return _brandTinder!!
        _brandTinder = tablerOutlineIcon(
            name = "BrandTinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.918f, 8.174f),
                    PathNode.CurveTo(21.478f, 13.156f, 19.419f, 19.83f, 13.538f, 20.8f),
                    PathNode.CurveTo(5.836f, 22.487f, 0.698f, 13.084f, 6.484f, 7.571f),
                    PathNode.CurveTo(6.793f, 7.266f, 7.645f, 6.476f, 8.0f, 6.222f),
                    PathNode.CurveTo(8.0f, 6.75f, 8.270001f, 9.697f, 9.0f, 9.389f),
                    PathNode.CurveTo(12.0f, 9.389f, 13.0f, 5.167f, 12.587f, 2.0f),
                    PathNode.CurveTo(15.287f, 3.411f, 17.574f, 5.376f, 18.918f, 8.174f)
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
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
