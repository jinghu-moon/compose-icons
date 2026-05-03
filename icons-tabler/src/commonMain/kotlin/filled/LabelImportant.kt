package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) return _labelImportant!!
        _labelImportant = tablerFilledIcon(
            name = "LabelImportant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.52f, 6.0f),
                    PathNode.CurveTo(17.127207f, 6.000076f, 17.701496f, 6.276f, 18.081f, 6.75f),
                    PathNode.LineTo(21.781f, 11.375f),
                    PathNode.CurveTo(22.0735f, 11.740333f, 22.0735f, 12.259667f, 21.781f, 12.625f),
                    PathNode.LineTo(18.081f, 17.249f),
                    PathNode.CurveTo(17.701694f, 17.723375f, 17.127375f, 17.999681f, 16.52f, 18.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(3.615637f, 17.99976f, 3.265427f, 17.779243f, 3.099102f, 17.432732f),
                    PathNode.CurveTo(2.932776f, 17.08622f, 2.979773f, 16.675043f, 3.22f, 16.375f),
                    PathNode.LineTo(6.72f, 12.0f),
                    PathNode.LineTo(3.22f, 7.625f),
                    PathNode.CurveTo(2.991639f, 7.340711f, 2.936126f, 6.954656f, 3.075134f, 6.617542f),
                    PathNode.CurveTo(3.214142f, 6.280427f, 3.525629f, 6.045704f, 3.888f, 6.005f),
                    PathNode.LineTo(4.0f, 6.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
