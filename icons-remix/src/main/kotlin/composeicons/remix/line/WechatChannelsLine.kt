package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WechatChannelsLine: ImageVector
    get() {
        if (_wechatChannelsLine != null) return _wechatChannelsLine!!
        _wechatChannelsLine = remixIcon(
            name = "WechatChannelsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.661 18.964c-.042-.049-.094-.118-.156-.21-.238-.354-.514-.905-.804-1.627C5.125 15.695 4.562 13.755 4.164 11.801 3.764 9.836 3.548 7.932 3.627 6.557c.04-.7 .153-1.162 .282-1.417 .029-.058 .055-.095 .074-.119C3.991 5.012 3.998 5.005 4.002 5c.292 .001 .739 .162 1.356 .651 .6 .476 1.25 1.174 1.927 2.032 1.236 1.565 2.463 3.532 3.551 5.326-.179 .315-.37 .66-.565 1.014-.092 .166-.184 .334-.278 .502-.419 .755-.864 1.536-1.325 2.245-.465 .715-.918 1.312-1.343 1.721-.301 .288-.521 .419-.666 .474ZM12 11.076C11.038 9.514 9.958 7.84 8.855 6.444 8.134 5.53 7.374 4.697 6.601 4.084 5.846 3.486 4.959 3 4 3 3.078 3 2.464 3.57 2.127 4.234c-.315 .62-.45 1.408-.496 2.208-.094 1.625 .16 3.722 .574 5.757 .416 2.045 1.011 4.106 1.64 5.673 .312 .778 .65 1.476 1 1.998 .174 .259 .377 .513 .613 .713 .226 .191 .582 .417 1.042 .417 .894 0 1.648-.526 2.211-1.067 .589-.565 1.139-1.31 1.635-2.073 .501-.77 .974-1.603 1.396-2.364 .085-.154 .168-.304 .249-.45 .008 .015 .016 .03 .024 .045 .068 .128 .139 .259 .211 .393 .408 .76 .866 1.595 1.357 2.367 .487 .766 1.035 1.517 1.639 2.087 .589 .557 1.359 1.061 2.278 1.061 .46 0 .817-.226 1.042-.417 .236-.2 .439-.454 .613-.713 .351-.521 .688-1.22 1-1.998 .63-1.568 1.224-3.628 1.64-5.673 .414-2.035 .667-4.132 .574-5.757-.046-.8-.181-1.588-.496-2.208C21.536 3.569 20.923 3 20 3c-.958 0-1.846 .485-2.601 1.084-.773 .613-1.533 1.446-2.254 2.36-1.102 1.396-2.183 3.07-3.145 4.633ZM13.162 13.011c1.089-1.795 2.317-3.763 3.553-5.328 .677-.857 1.327-1.556 1.927-2.032 .617-.489 1.064-.65 1.356-.651 .005 .005 .011 .012 .019 .022 .019 .023 .045 .061 .074 .119 .13 .255 .242 .717 .282 1.417 .079 1.375-.137 3.278-.537 5.243-.398 1.955-.961 3.894-1.536 5.327-.29 .722-.566 1.273-.804 1.627-.066 .097-.121 .168-.164 .218-.173-.052-.417-.186-.736-.488-.426-.403-.871-.994-1.324-1.706-.449-.706-.877-1.485-1.283-2.241-.067-.125-.134-.25-.2-.374-.215-.401-.425-.795-.626-1.152Z"),
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
        return _wechatChannelsLine!!
    }

private var _wechatChannelsLine: ImageVector? = null
