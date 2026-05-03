package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = tablerOutlineIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.CurveTo(16.656855f, 3.0f, 18.0f, 4.343146f, 18.0f, 6.0f),
                    PathNode.CurveTo(19.357777f, 5.99971f, 20.546478f, 6.911397f, 20.898224f, 8.222821f),
                    PathNode.CurveTo(21.24997f, 9.534245f, 20.677057f, 10.918426f, 19.50138f, 11.597649f),
                    PathNode.CurveTo(18.325705f, 12.276873f, 16.8404f, 12.081786f, 15.88f, 11.122f),
                    PathNode.LineTo(11.122f, 15.88f),
                    PathNode.CurveTo(12.066168f, 16.824951f, 12.27181f, 18.28033f, 11.626416f, 19.449883f),
                    PathNode.CurveTo(10.981024f, 20.619436f, 9.640096f, 21.221373f, 8.337269f, 20.926369f),
                    PathNode.CurveTo(7.034443f, 20.631363f, 6.083617f, 19.510492f, 6.005f, 18.177f),
                    PathNode.LineTo(6.005f, 18.0f),
                    PathNode.LineTo(5.829f, 18.0f),
                    PathNode.CurveTo(4.494989f, 17.921827f, 3.373511f, 16.970745f, 3.078512f, 15.667413f),
                    PathNode.CurveTo(2.783513f, 14.36408f, 3.386122f, 13.022763f, 4.556447f, 12.377753f),
                    PathNode.CurveTo(5.726772f, 11.732743f, 7.18262f, 11.939567f, 8.127f, 12.885f),
                    PathNode.LineTo(12.885f, 8.127f),
                    PathNode.CurveTo(12.02669f, 7.26924f, 11.769629f, 5.978891f, 12.233695f, 4.85769f),
                    PathNode.CurveTo(12.697762f, 3.736489f, 13.791554f, 3.005259f, 15.005f, 3.005f),
                    PathNode.LineTo(15.0f, 3.0f)
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
        return _bone!!
    }

private var _bone: ImageVector? = null
