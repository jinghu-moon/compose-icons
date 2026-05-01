package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandInstagram: ImageVector
    get() {
        if (_brandInstagram != null) return _brandInstagram!!
        _brandInstagram = tablerFilledIcon(
            name = "BrandInstagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.CurveTo(18.761423f, 3.0f, 21.0f, 5.238577f, 21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.CurveTo(21.0f, 18.761423f, 18.761423f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(5.238577f, 21.0f, 3.0f, 18.761423f, 3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 5.238577f, 5.238577f, 3.0f, 8.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(9.868599f, 7.999999f, 8.111571f, 9.671265f, 8.005f, 11.8f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 14.209139f, 9.790861f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(14.209139f, 16.0f, 16.0f, 14.209139f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 9.790861f, 14.209139f, 8.0f, 12.0f, 8.0f),
                    PathNode.MoveTo(16.5f, 6.5f),
                    PathNode.CurveTo(15.993025f, 6.500067f, 15.566316f, 6.879507f, 15.507f, 7.383f),
                    PathNode.LineTo(15.5f, 7.51f),
                    PathNode.CurveTo(15.500587f, 8.039093f, 15.913211f, 8.476165f, 16.441395f, 8.507172f),
                    PathNode.CurveTo(16.96958f, 8.538179f, 17.43051f, 8.152391f, 17.493f, 7.627f),
                    PathNode.LineTo(17.5f, 7.5f),
                    PathNode.CurveTo(17.5f, 6.947716f, 17.052284f, 6.5f, 16.5f, 6.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandInstagram!!
    }

private var _brandInstagram: ImageVector? = null
