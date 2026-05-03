package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDingtalk: ImageVector
    get() {
        if (_brandDingtalk != null) return _brandDingtalk!!
        _brandDingtalk = tablerOutlineIcon(
            name = "BrandDingtalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.970562f, 16.970562f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.029437f, 21.0f, 3.0f, 16.970562f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.029437f, 7.029437f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.970562f, 3.0f, 21.0f, 7.029437f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 7.5f),
                    PathNode.LineTo(15.02f, 10.132f),
                    PathNode.CurveTo(15.275573f, 10.228143f, 15.480716f, 10.424614f, 15.587799f, 10.675798f),
                    PathNode.CurveTo(15.694883f, 10.926984f, 15.694594f, 11.211033f, 15.587f, 11.462f),
                    PathNode.LineTo(14.5f, 14.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.CurveTo(8.9f, 14.03f, 8.886f, 10.861f, 8.0f, 7.5f)
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
        return _brandDingtalk!!
    }

private var _brandDingtalk: ImageVector? = null
