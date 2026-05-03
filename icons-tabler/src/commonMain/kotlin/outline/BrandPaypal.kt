package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) return _brandPaypal!!
        _brandPaypal = tablerOutlineIcon(
            name = "BrandPaypal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(12.5f, 13.0f),
                    PathNode.CurveTo(15.0f, 13.0f, 17.5f, 10.5f, 17.5f, 8.0f),
                    PathNode.CurveTo(17.5f, 5.0f, 15.6f, 3.0f, 12.5f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.CurveTo(6.5f, 3.0f, 6.0f, 3.5f, 6.0f, 4.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 18.5f, 4.5f, 19.0f, 5.0f, 19.0f),
                    PathNode.LineTo(7.8f, 19.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.1f, 13.4f, 9.4f, 13.0f, 10.0f, 13.0f),
                    PathNode.MoveTo(17.5f, 7.2f),
                    PathNode.CurveTo(19.2f, 8.2f, 20.0f, 10.0f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 14.5f, 17.5f, 16.5f, 15.0f, 16.5f),
                    PathNode.LineTo(12.4f, 16.5f),
                    PathNode.LineTo(11.8f, 20.1f),
                    PathNode.CurveTo(11.703526f, 20.573124f, 11.282761f, 20.909737f, 10.8f, 20.9f),
                    PathNode.LineTo(8.100001f, 20.9f),
                    PathNode.CurveTo(7.948096f, 20.903076f, 7.803034f, 20.836914f, 7.705766f, 20.720194f),
                    PathNode.CurveTo(7.6085f, 20.603474f, 7.569582f, 20.44886f, 7.6f, 20.3f),
                    PathNode.LineTo(7.8f, 18.9f)
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
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
