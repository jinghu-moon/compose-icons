package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = radixIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1c1.765 0 1.987 .007 2.68 .039 .692 .031 1.165 .141 1.578 .302 .434 .163 .827 .419 1.151 .75 .331 .325 .587 .718 .75 1.151 .161 .413 .27 .886 .302 1.578 .032 .693 .039 .915 .039 2.68 0 1.765-.007 1.987-.039 2.68-.031 .692-.141 1.165-.302 1.578-.167 .432-.423 .824-.75 1.151-.327 .327-.72 .583-1.151 .75-.413 .161-.886 .27-1.578 .302C9.487 13.993 9.265 14 7.5 14 5.735 14 5.513 13.993 4.82 13.961c-.692-.031-1.165-.141-1.578-.302-.434-.163-.827-.419-1.151-.75-.331-.325-.586-.718-.749-1.151-.161-.413-.271-.886-.303-1.578C1.007 9.487 1 9.265 1 7.5 1 5.735 1.007 5.513 1.039 4.82c.031-.692 .141-1.165 .302-1.578 .163-.434 .419-.827 .75-1.151 .325-.331 .718-.587 1.151-.75 .413-.161 .886-.27 1.578-.302C5.513 1.007 5.735 1 7.5 1ZM7.5 2C6.006 2 5.817 1.997 5.23 2.023c-.461 .021-.992 .048-1.414 .176-.422 .127-.754 .301-1.098 .684-.344 .383-.449 .7-.543 1.012-.098 .324-.13 .754-.156 1.34C2.006 5.528 2.002 5.721 2 6.027v2.945c.002 .306 .006 .5 .02 .793 .027 .585 .059 1.016 .156 1.34 .094 .312 .199 .629 .543 1.012 .344 .383 .675 .556 1.098 .684 .422 .127 .953 .155 1.414 .176 .587 .027 .776 .023 2.27 .023 1.494 0 1.679 .006 2.266-.021 .585-.027 1.016-.059 1.34-.156 .312-.094 .629-.199 1.012-.543 .383-.344 .556-.675 .684-1.098 .127-.422 .155-.953 .176-1.414C13.003 9.182 13 8.993 13 7.5c0-1.493 .003-1.683-.023-2.27-.021-.461-.049-.992-.176-1.414-.127-.422-.301-.754-.684-1.098-.383-.344-.7-.449-1.012-.543-.324-.098-.755-.13-1.34-.156C9.179 1.993 8.994 2 7.5 2ZM7.5 4.25c1.795 0 3.25 1.455 3.25 3.25-0 1.795-1.455 3.25-3.25 3.25C5.705 10.75 4.25 9.295 4.25 7.5 4.25 5.705 5.705 4.25 7.5 4.25ZM7.5 5.25C6.258 5.25 5.25 6.258 5.25 7.5c0 1.242 1.008 2.25 2.25 2.25C8.742 9.75 9.75 8.742 9.75 7.5 9.75 6.258 8.742 5.25 7.5 5.25ZM10.97 3.28c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
