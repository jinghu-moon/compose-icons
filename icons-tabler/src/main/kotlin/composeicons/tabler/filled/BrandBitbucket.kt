package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) return _brandBitbucket!!
        _brandBitbucket = tablerFilledIcon(
            name = "BrandBitbucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.661 3l16.68 .007c.484-.005 .946 .203 1.262 .57 .316 .368 .454 .856 .364 1.396L18.629 19.624C18.499 20.421 17.808 21.005 17 21h-10.01C6.084 20.991 5.312 20.332 5.17 19.483L2.022 4.907c-.079-.479 .058-.968 .374-1.336C2.713 3.203 3.176 2.994 3.661 3M15 8h-6c-.294 0-.573 .129-.763 .354-.19 .224-.272 .521-.223 .81l1 6c.08 .482 .497 .836 .986 .836h4c.489-0 .906-.354 .986-.836l1-6c.048-.29-.034-.586-.223-.81C15.573 8.129 15.294 8 15 8"),
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
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
