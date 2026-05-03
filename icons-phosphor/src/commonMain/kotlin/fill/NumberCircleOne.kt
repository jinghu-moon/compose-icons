package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleOne: ImageVector
    get() {
        if (_numberCircleOne != null) return _numberCircleOne!!
        _numberCircleOne = phosphorFillIcon(
            name = "NumberCircleOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 180.41827f, 136.41827f, 184.0f, 132.0f, 184.0f),
                    PathNode.CurveTo(127.58172f, 184.0f, 124.0f, 180.41827f, 124.0f, 176.0f),
                    PathNode.LineTo(124.0f, 95.0f),
                    PathNode.LineTo(112.44f, 102.71f),
                    PathNode.CurveTo(108.76178f, 105.16215f, 103.792145f, 104.16821f, 101.34f, 100.49f),
                    PathNode.CurveTo(98.887856f, 96.81178f, 99.88178f, 91.84214f, 103.56f, 89.39f),
                    PathNode.LineTo(127.56f, 73.39f),
                    PathNode.CurveTo(130.00801f, 71.75665f, 133.15512f, 71.59921f, 135.75392f, 72.98009f),
                    PathNode.CurveTo(138.35272f, 74.36096f, 139.98355f, 77.05716f, 140.0f, 80.0f),
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
        return _numberCircleOne!!
    }

private var _numberCircleOne: ImageVector? = null
