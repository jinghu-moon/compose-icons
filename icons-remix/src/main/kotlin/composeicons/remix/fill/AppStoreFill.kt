package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppStoreFill: ImageVector
    get() {
        if (_appStoreFill != null) return _appStoreFill!!
        _appStoreFill = remixIcon(
            name = "AppStoreFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM8.823 15.343c-.395-.476-.885-.647-1.479-.509l-.15 .041-.589 1.016c-.226 .395-.093 .899 .302 1.125 .362 .207 .816 .112 1.063-.209l.062-.093 .79-1.371ZM13.21 8.661c-.488 .403-.98 1.597-.29 2.786l3.04 5.266c.23 .395 .73 .528 1.125 .302 .362-.211 .504-.648 .351-1.024l-.049-.101-.802-1.391h1.19c.456 0 .823-.367 .823-.823 0-.421-.313-.766-.719-.816l-.103-.006h-2.141L13.44 9.057l-.23-.396ZM13.488 5.617c-.362-.207-.816-.112-1.063 .209l-.062 .093-.367 .633-.359-.633c-.23-.395-.73-.528-1.125-.302-.362 .211-.504 .648-.352 1.024l.049 .101 .839 1.456L8.363 12.851h-2.097c-.456 0-.823 .367-.823 .823 0 .421 .313 .766 .719 .816l.103 .006h7.48c.341-.64-.061-1.549-.81-1.638l-.121-.007h-2.552L13.79 6.742c.226-.395 .093-.899-.302-1.125Z"),
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
        return _appStoreFill!!
    }

private var _appStoreFill: ImageVector? = null
