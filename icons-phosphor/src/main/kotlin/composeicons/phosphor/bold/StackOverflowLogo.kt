package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorBoldIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 151.67v64.33c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-64.33c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v52.23h136v-52.23c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM88 183.81h80c6.523-.188 11.713-5.53 11.713-12.055 0-6.525-5.19-11.867-11.713-12.055h-80c-6.523 .188-11.713 5.53-11.713 12.055 0 6.525 5.19 11.867 11.713 12.055ZM96.2 113l75.17 27.49c6.257 2.267 13.168-.968 15.435-7.225 2.267-6.257-.968-13.168-7.225-15.435L104.41 90.35c-6.255-2.267-13.163 .965-15.43 7.22-2.267 6.255 .965 13.163 7.22 15.43ZM128 49.29l61.29 51.64c5.076 4.256 12.641 3.593 16.9-1.48 4.272-5.107 3.611-12.708-1.48-17L143.44 30.82c-2.44-2.046-5.592-3.038-8.764-2.759-3.172 .279-6.102 1.808-8.146 4.249-4.256 5.103-3.599 12.684 1.47 16.98Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
