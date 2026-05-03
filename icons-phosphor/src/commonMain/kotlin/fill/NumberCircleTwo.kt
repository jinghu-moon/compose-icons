package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorFillIcon(
            name = "NumberCircleTwo",
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
                    PathNode.MoveTo(152.0f, 168.0f),
                    PathNode.CurveTo(156.41827f, 168.0f, 160.0f, 171.58173f, 160.0f, 176.0f),
                    PathNode.CurveTo(160.0f, 180.41827f, 156.41827f, 184.0f, 152.0f, 184.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.CurveTo(100.969826f, 184.0f, 98.19972f, 182.28798f, 96.84458f, 179.57771f),
                    PathNode.CurveTo(95.48945f, 176.86742f, 95.78189f, 173.62415f, 97.6f, 171.2f),
                    PathNode.LineTo(140.77f, 113.64f),
                    PathNode.CurveTo(144.54596f, 108.60791f, 145.02252f, 101.83005f, 141.98785f, 96.31909f),
                    PathNode.CurveTo(138.95319f, 90.80814f, 132.9706f, 87.58708f, 126.699295f, 88.08764f),
                    PathNode.CurveTo(120.42799f, 88.588196f, 115.03208f, 92.71745f, 112.91f, 98.64f),
                    PathNode.CurveTo(111.4354f, 102.80699f, 106.86199f, 104.9896f, 102.695f, 103.515f),
                    PathNode.CurveTo(98.528015f, 102.0404f, 96.3454f, 97.46699f, 97.82f, 93.3f),
                    PathNode.CurveTo(102.035866f, 81.43154f, 112.82163f, 73.13992f, 125.375015f, 72.116936f),
                    PathNode.CurveTo(137.92839f, 71.09395f, 149.91432f, 77.529884f, 155.99614f, 88.55917f),
                    PathNode.CurveTo(162.07796f, 99.58847f, 161.12439f, 113.15955f, 153.56f, 123.23f),
                    PathNode.LineTo(120.0f, 168.0f),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
